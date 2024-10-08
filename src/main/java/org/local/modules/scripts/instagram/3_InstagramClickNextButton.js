/**
 * this is compile from 3_InstagramClickNextButton.ts
 *
 * @author Wender Couto
 * @since 0.0.3 Beta
 */

function clickNextButton() {
    var button = document.querySelector("svg[aria-label='Avançar']");
    if (button && button.parentElement) {
        button.parentElement.click();
        console.log('Botão Avançar clicado!');
    }
    else {
        console.log('Botão Avançar não encontrado.');
    }
}
clickNextButton();
