/**
 * Compiled from 1_FacebookScrollToNextButtonAndLike.ts
 *
 * @author Wender Couto
 * @since 0.0.3 Beta
 */
function getVisibleLikeButtons() {
    var allLikeButtons = document.querySelectorAll('div[aria-label="Curtir"]');
    var visibleLikeButtons = [];
    for (var i = 0; i < allLikeButtons.length; i++) {
        var button = allLikeButtons[i];
        var isDisplayed = window.getComputedStyle(button).display !== 'none';
        var hasParent = button.offsetParent !== null;
        var isNotPressed = button.getAttribute('aria-pressed') === 'false';
        if (isDisplayed && hasParent && isNotPressed) {
            visibleLikeButtons.push(button);
        }
    }
    return visibleLikeButtons;
}
function likeFirstVisibleButtonAndScroll() {
    var likeButtons = getVisibleLikeButtons();
    if (likeButtons.length > 0) {
        var firstButton = likeButtons[0];
        firstButton.click();
        var post = firstButton.closest('div');
        if (post !== null) {
            var shareSection = post.querySelector('div[aria-label="Compartilhar"]');
            if (shareSection !== null) {
                shareSection.scrollIntoView({ behavior: 'smooth' });
            }
        }
    }
}
likeFirstVisibleButtonAndScroll();
