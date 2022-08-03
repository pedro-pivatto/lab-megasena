let request = new XMLHttpRequest()
let data = [];

request.open('GET', './info', false)
request.onload = function () {
  // Begin accessing JSON data here
  data = JSON.parse(this.response)
 
  if (request.status >= 200 && request.status < 400) {
    } else {
    console.log('error')
  }
}

request.send()


//Reset button
const reset = (ev) => {
    //Erases the result text

    
    
    msg.textContent = '';
    //Hides 'Resultado'
    document.getElementById('result').style.display = 'none';
}

//Send button
const checkNumbers = (ev) => {
    ev.preventDefault();
    //Variables
    let form = document.forms[0];
    let msg = document.getElementById('msg');
    let match = 0;
    let register = [];
    let text = '';
    let numbers = [];
    let err = 0;


    //Displays 'Resultado'
    document.getElementById('result').style.display = 'block';

    //Iterates through the inputs from form
    for(let i=0; i<15; i++) {
        //If incorrect input from user, error
        if(form.elements[i].value < 0 || form.elements[i].value > 60) {
            err = 1;
        }
    
        //Fills the numbers with zeros and isolates the number inputs from the form to the numbers array
        if(form.elements[i].value < 10 && form.elements[i].value.length < 2) {
            form.elements[i].value = "0" + form.elements[i].value;
            if(form.elements[i].value == "0") {
                form.elements[i].value += "0";
            }
        }
        numbers.push(form.elements[i].value);
    }

    //Deletes duplicates
    numbers = numbers.filter((item, index, self) => {
        return self.indexOf(item) == index;
    })



    if(numbers.length < 7) {
        err = 2;
    }





    //Checks if there is any error
    if(err == 1) {
        msg.textContent = "Insira valores entre 1 e 60!";
        err = 0;
    } else if (err ==2 ) {
        msg.textContent = "Insira no mínimo 6 valores diferentes!";
        err = 0;
    } else {
        //Iterates through all the contests
    // console.log(data)

        data.forEach((element) => {
            //Iterates through all the contest numbers
            element.dezenas.forEach((number) => {
                //Iterates through all the unique input numbers
                numbers.forEach((num, index) => {
                    if(num == number) {
                        match = match + 1;
                    }
                })
            })

            //If more than 4 matches, saves the data
            if(match >= 4) {
                register.push({contest: element.numero_concurso, matches: match});
            }
            
            //Reset variable
            match = 0;
        })

        // If there is any positive result
        if(register.length > 0) {
            //Iterates through all the positive results
            register.forEach((element, index) => {
                text += `Você teve ${register[index].matches} acertos no sorteio ${register[index].contest}<br>`;
            })

            msg.innerHTML = text;
        } else {
            msg.textContent = "Você não teve nenhum acerto!";
        }
    }
}

document.getElementById('button-send').addEventListener('click', checkNumbers);

document.getElementById('button-reset').addEventListener('click', reset);
