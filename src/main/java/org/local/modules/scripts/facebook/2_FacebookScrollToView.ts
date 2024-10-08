/**
 * Compiled from 2_FacebookScrollToView.ts
 *
 * @author Wender Couto
 * @since 0.0.3 Beta
 */
function getVisibleShareButtons() {
    var allShareButtons = document.querySelectorAll('div[aria-label="Compartilhar"], div[aria-label="Envie para seus amigos ou publique no seu perfil."]');
    var visibleShareButtons = [];
    for (var i = 0; i < allShareButtons.length; i++) {
        var button = allShareButtons[i];
        var isDisplayed = window.getComputedStyle(button).display !== 'none';
        var hasParent = button.offsetParent !== null;
        if (isDisplayed && hasParent) {
            visibleShareButtons.push(button);
        }
    }
    return visibleShareButtons;
}
function scrollToFirstShareButtonAndClick() {
    var shareButtons = getVisibleShareButtons();
    if (shareButtons.length > 0) {
        var firstButton = shareButtons[0];
        firstButton.scrollIntoView({ behavior: 'smooth' });
        firstButton.click();
    }
}
scrollToFirstShareButtonAndClick();
