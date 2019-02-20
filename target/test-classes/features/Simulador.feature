#language: pt
#encoding: iso-8859-1
Funcionalidade: Testar valor ideal no simulador

  Cenario: Realizar uma simulacao no sistema com 21 reais em 12 meses
    Dado que abri a url do simulador
    E selecionei para voce
    E preenchi o valor "20,00" que quero aplicar
    E preenchi o valor "20,00" que quero poupar
    E preenchi "12" meses que quero poupar
    Entao clico em simular
    E devo ver a tabela com mes e valor

  Cenario: Realizar uma simulacao no sistema com 21 reais em 12 meses para empresa
    Dado que abri a url do simulador
    E selecionei para empresa
    E preenchi o valor "20,00" que quero aplicar
    E preenchi o valor "20,00" que quero poupar
    E preenchi "12" meses que quero poupar
    Entao clico em simular
    E devo ver a tabela com mes e valor

  
  Esquema do Cenario: Verificar campos obrigatorios
    Dado que abri a url do simulador
    E selecionei para voce
    E preenchi o valor "<APLICAR>" que quero aplicar
    E preenchi o valor "<POUPAR>" que quero poupar
    E preenchi "<MESES>" meses que quero poupar
    Entao clico em simular
    Entao deve apresentar a mensagem de campos obrigatorios

    Exemplos: 
      | APLICAR | POUPAR | MESES |
      |   00,00 |  00,00 |       |
      |   19,00 |  19,00 |       |
      |   00,00 |  00,00 |       |
      |   19,00 |  19,00 |       |

@teste
  Cenario: Refazer simulacao
    Dado que abri a url do simulador
    E selecionei para empresa
    E preenchi o valor "20,00" que quero aplicar
    E preenchi o valor "20,00" que quero poupar
    E preenchi "12" meses que quero poupar
    Entao clico em simular
    E clico em refazer simulacao
    Entao devo ver o simulador sem dados preenchidos