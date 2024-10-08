# Projeto Automação Facebook-Instagram

Este projeto foi desenvolvido com o objetivo de automatizar certas interações com as plataformas Facebook e Instagram.<br>
É importante destacar que não tenho intenção de infringir os termos de serviço dessas plataformas.

**Uso Comercial:**
Este projeto é licenciado sob a GPL-3.0 (GNU General Public License v3.0).<br>
Embora permita ampla liberdade de uso e modificação, incentivamos que seu uso para fins comerciais seja evitado.<br>
A GPL-3.0 garante seus direitos e obrigações ao utilizar este software. Para mais informações, consulte o texto completo da GPL-3.0 no arquivo `LICENSE` neste repositório ou clique [aqui](https://github.com/WenderCouto/Automacao-Facebook-Instagram-PT-BR/blob/main/LICENSE).

## Considerações, Atualizações.
Informo que este projeto foi executado em ambiente Windows `(Windows 10)` majoritariamente.<br>
Houveram algumas ocasiões em que usei o `macOS` na versão Versão 14 `(Sonoma)`. <br>
Não foram realizados testes no Linux. (Ainda não.)

## Primeiros passos:
Este projeto foi feito para rodar direto na [IDE](https://www.jetbrains.com/pt-br/idea/download/), e certifique-se de baixar a versão comunity ou semelhante para uma solução gratuita.

![image-preview](https://github.com/WenderCouto/Automacao-Facebook-Instagram-PT-BR/blob/main/src/main/resources/Intelij%20Comunity%20Edition%20Image.png)

Após instalar a IDE, configurar a JDK, e clonar o repositório.<br>
Você vai abrir o projeto pela IDE.<br>
Feito isso procure pelo documento `config.json` localizado em `Automacao-Facebook-Instagram-PT-BR/src/main/resources/`<br>
Você vai se deparar com isto ao abrir o arquivo:
``` Json
{
	"$CAMINHO_ARQUIVO + XLSX": "/Users/Developer/Downloads/Automacao-Facebook-Instagram-PT-BR/src/main/resources/senhas_e_contas_atualizado_exemplo.xlsx",
	"navegador": "firefox",
	"ativar bot facebook": true,
	"link conta cliente/alvo facebook": "https://www.facebook.com/{missing_link}/",
	"nome do usuario cliente/alvo facebook": "{missing_name}",
	"numero bots facebook": 20,
	"ativar bot instagram": false,
	"link conta cliente/alvo instagram": "https://www.instagram.com/{missing_link}/",
	"IG do usuario cliente/alvo instagram": "{Não implementado | Não necessário}",
	"numero bots instagram": 0,
	"report facebook post by link": true,
	"inativar bots automaticamente" : true,
	"numero de instancias por vez": 4,
	"Timer de trabalho em contas em minutos" : 5
}
```
Livre para usar snake_case, camelCase ou simplesmente separando por espaços, sendo a única exceção a variavel do caminho do arquivo.<br>
Deve ficar atento aos campos `ESTADO_INSTAGRAMS` e `ESTADO_FACEBOOKS` no documento xslx de exemplo usado, encontrado no mesmo diretório que o documento JSON.

| EMAILS | SENHAS_EMAILS | ESTADO_EMAILS | INSTAGRAMS        | SENHAS_INSTAGRAM | ESTADO_INSTAGRAMS | FACEBOOKS | SENHAS_FACEBOOKS | ESTADO_FACEBOOKS | REPORT_FACEBOOK_POST_POR_LINK |
|-----|-----|-----|------------------|------------------|-----|-----|-----|-----|-----| 
| exemplo@mail.com | senha do email | Ativo ou Ativado	 | exemplo@mail.com | senha            | Ativo ou Ativado | mesmo | mesmo | Ativo ou Ativado | um link direto |

Repare que ali esta como `"Ativo ou Ativado"` mas deve ser um só.<br>
Ex:

| ESTADO_FACEBOOKS | ESTADO_INSTAGRAMS |
|------------------|-------------------|
| Ativo | Ativado |

Aqui temos ambos, mas em celulas diferentes, totalmente válido.<br>
Certifique-se de mudar isso antes de rodar o projeto, e altere os outros campos com os dados necessários.

## Notas:
<p>Atualizando o Projeto em Inglês, como este projeto foi todo feito em português, usando atributos das páginas web no inglês.</p>
<p>Aviso que, a função de likes deve sofrer alteração para funcionar por carregar scripts.</p>
<p>O programa deve apresentar muitas falhas e comportamentos inesperados por ser uma interação web.</p>
<p>Fico interessado em feed-backs caso surgir soluções melhores que usar JNI para manipular as janelas.</p>