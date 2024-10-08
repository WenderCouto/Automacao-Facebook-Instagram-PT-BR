/**
 * this is compile from 2_InstagramLikePosts.ts
 *
 * @author Wender Couto
 * @since 0.0.3 Beta
 */

function likePosts() {
    var unlikeButton = document.querySelector("svg[aria-label='Descurtir']");
    var likeButton = document.querySelector("svg[aria-label='Curtir']");
    if (unlikeButton) {
        console.log('A primeira postagem já foi curtida anteriormente. Ignorando...');
    }
    else if (likeButton && likeButton.parentElement) {
        likeButton.parentElement.click();
        console.log('Postagem curtida!');
    }
}
likePosts();
