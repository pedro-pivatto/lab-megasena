request = new XMLHttpRequest()
table = []

request.open('GET', './info', false)
request.onload = -> 
  table = JSON.parse(this.response)
  unless (request.status >= 200 and request.status < 400)
    console.log("error")

request.send()

checkNumbers = (ev) ->
  result = document.getElementById("result")
  form = document.forms[0]
  numbers = []
  register = []
  match = 0
  text = ''

  ev.preventDefault()
  result.style.display = "block"


  for i in [0..14]
    if form.elements[i].value < 0 or form.elements[i].value > 60
      err = 1

    until form.elements[i].value.length >= 2
      form.elements[i].value = "0" + form.elements[i].value
  
    numbers.push(form.elements[i].value)

  numbers = numbers.filter (item, index, self) -> self.indexOf(item) is index

  if numbers.length < 7 then err = 2

  switch err
    when 1 then msg.textContent = "Insira valores entre 1 e 60!"
    when 2 then msg.textContent = "Insira no mínimo 6 valores diferentes!"
    else 
      for contest in table
        for number in contest.dezenas
          for inputNum in numbers
            if inputNum is number then match++
      
        if match >= 4 then register.push({contest: contest.numero_concurso, matches: match})
        match = 0

      if register.length > 0
        for i in [0..register.length-1]
          text += "Você teve #{register[i].matches} acertos no sorteio #{register[i].contest}<br>"
        msg.innerHTML = text
      else msg.textContent = "Você não teve nenhum acerto!"

  err = 0

reset = ->
  msg = document.getElementById("msg")
  result = document.getElementById("result")

  msg.textContent = ""
  result.style.display = "none"



document.getElementById("button-send").addEventListener("click", checkNumbers);

document.getElementById("button-reset").addEventListener("click", reset);