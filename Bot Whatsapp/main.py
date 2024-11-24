import openpyxl
from urllib.request import quote
from time import sleep
import webbrowser
import pyautogui  

plan = openpyxl.load_workbook('clientes.xlsx')
planat = plan['Sheet1']

#webbrowser.open('https://web.whatsapp.com/')

sleep(20)
"""for linha in planat.iter_rows(min_row=2):
    nome= linha[0].value
    telefone = int(linha[1].value)"""
texto = f'Olá, gostaria de mais informações!'
link_mensagem = f'https://api.whatsapp.com/send?phone=&text={quote(texto)}'
print(link_mensagem)
    
#try:
#        webbrowser.open(link_mensagem)
#
#        sleep(10)
#        seta = pyautogui.locateCenterOnScreen('seta.png')
#        sleep(10)
#        pyautogui.click(seta[0], seta[1])
#        sleep(10)
#        pyautogui.hotkey('ctrl', 'w')
#        sleep(10)
#
#except:
#        print(f'Não foi possível enviar a mensagem para {nome}')
#        with open('erros.csv', 'a', newline='', encoding='utf-8') as arquivo:
#            arquivo.write(f'{nome, telefone}')


    #press('Enter')