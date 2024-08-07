import json
texto = "while i < 1 do i = i + j;"
Tokens_validos = {"palavras_reservadas": ["while", "do"], "operadores": ["<","=","+"], "terminador": ";", 
         "identificadores": ["i", "j"]}

def is_constantes(token):#"numeros": [0,1,2,3,4,5,6,7,8,9]
    try:
        if type(int(token))==int and int(token)>=0:
            return True
    except:
        return False

def Separar_Tokens(token_entrada):
    if token_entrada[-1]==";" and token_entrada[-2]==" ":
        #token_entrada = token_entrada.replace(";", " ;")
        tokens_separados = (token_entrada.split(" "))
        return tokens_separados
    elif token_entrada[-1]==";":
        token_entrada = token_entrada.replace(";", " ;")
        tokens_separados = (token_entrada.split(" "))
        return tokens_separados
    else:
        return ValueError("Não possui o terminador[;]")

def Classifica_Tokens(token):
    if token in Tokens_validos.get("palavras_reservadas"):
       return [token, "palavras_reservadas"]
    elif token in Tokens_validos.get("operadores"):
        return [token,"operadores"]
    elif token in Tokens_validos.get("terminador"):
        return [token,"terminador"]
    elif token in Tokens_validos.get("identificadores"):
        return [token,"identificadores"]
    elif is_constantes(token):
        return [token,"constante"]
    else:
        return ValueError("Token Inválido")
    
def TB_Simbolos(lista_tokens):
    tabela_simbolos = []
    for i in lista_tokens:
        if (Classifica_Tokens(i)[1])=="identificadores" or is_constantes(i):
            if not i in tabela_simbolos:
                tabela_simbolos.append(i)
    texto = []
    indice = 1
    for s in tabela_simbolos:
        texto.append(f"índice: {indice} - Símbolo: {s}\n")
        indice+=1
    texto_saida = "".join(texto)
    arquivo = open("tabela_simbolos.txt", "w")
    arquivo.write(texto_saida)
    arquivo.close()
    return tabela_simbolos

def TB_Tokens(lista_tokens, TB_Simbolos):
    print(lista_tokens)
    print(TB_Simbolos)

token_sep = Separar_Tokens(texto)
tabela_simbolos = TB_Simbolos(token_sep)
TB_Tokens(token_sep, tabela_simbolos)

'''Tokens_validos = {"palavras_reservadas": ["while", "do"], "operadores": ["<","=","+"], "terminador": ";", 
         "identificadores": ["i", "j"], "numeros": [0,1,2,3,4,5,6,7,8,9]}'''
         #token, identificacao, tamamnho, posicao