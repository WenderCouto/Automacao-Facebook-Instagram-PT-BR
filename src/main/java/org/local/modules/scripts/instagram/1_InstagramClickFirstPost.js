/**
 * this is compile from 1_InstagramClickFirstPost.ts
 *
 * @author Wender Couto
 * @since 0.0.3 Beta
 */

function clickFirstPost() {
    var divs = document.querySelectorAll('div[style*="display: flex"]');
    var primeiroLink = divs[0].querySelector('a[role="link"]');
    if (primeiroLink instanceof HTMLElement) {
        primeiroLink.click();
    }
    else {
        console.log('Nenhuma postagem encontrada para clicar.');
    }
}
clickFirstPost();