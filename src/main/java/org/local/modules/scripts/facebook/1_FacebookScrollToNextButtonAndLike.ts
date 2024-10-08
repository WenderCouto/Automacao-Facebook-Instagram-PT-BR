/**
 * 1_FacebookScrollToNextButtonAndLike.ts
 *
 * @author Wender Couto
 * @since 0.0.3 Beta
 */

function getVisibleLikeButtons(): HTMLElement[] {
    let allLikeButtons: NodeListOf<HTMLElement> = document.querySelectorAll('div[aria-label="Curtir"]');
    let visibleLikeButtons: HTMLElement[] = [];

    for (let i = 0; i < allLikeButtons.length; i++) {
        let button = allLikeButtons[i];
        let isDisplayed = window.getComputedStyle(button).display !== 'none';
        let hasParent = button.offsetParent !== null;
        let isNotPressed = button.getAttribute('aria-pressed') === 'false';

        if (isDisplayed && hasParent && isNotPressed) {
            visibleLikeButtons.push(button);
        }
    }

    return visibleLikeButtons;
}

function likeFirstVisibleButtonAndScroll(): void {
    let likeButtons: HTMLElement[] = getVisibleLikeButtons();

    if (likeButtons.length > 0) {
        let firstButton: HTMLElement = likeButtons[0];
        firstButton.click();

        let post: HTMLElement | null = firstButton.closest('div');
        if (post !== null) {
            let shareSection: HTMLElement | null = post.querySelector('div[aria-label="Compartilhar"]');
            if (shareSection !== null) {
                shareSection.scrollIntoView({ behavior: 'smooth' });
            }
        }
    }
}

likeFirstVisibleButtonAndScroll();