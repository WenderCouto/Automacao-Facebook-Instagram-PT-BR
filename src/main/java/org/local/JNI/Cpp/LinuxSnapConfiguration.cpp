#include <jni.h>
#include <org_local_Configurations_SnapConfiguration.h>
#include <X11/Xlib.h>

/**
 * LinuxSnapConfiguration class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

extern "C" {

    JNIEXPORT jobject JNICALL Java_org_local_Configurations_SnapConfiguration_positionWindowInCorner(JNIEnv *env, jobject obj, jint x, jint y, jint width, jint height, jint windowPositionIndex) {

        Display *display = XOpenDisplay(NULL);
        Window activeWindow = XDefaultRootWindow(display);
        int screenWidth = XWidthOfScreen(XDefaultScreenOfDisplay(display));
        int screenHeight = XHeightOfScreen(XDefaultScreenOfDisplay(display));

        int quadrantWidth = screenWidth / 2;
        int quadrantHeight = screenHeight / 2;

        switch (windowPositionIndex) {
            case 0:
                x = 0;
                y = 0;
                break;
            case 1:
                x = quadrantWidth;
                y = 0;
                break;
            case 2:
                x = quadrantWidth;
                y = quadrantHeight;
                break;
            case 3:
                x = 0;
                y = quadrantHeight;
                break;
        }

        width = quadrantWidth;
        height = quadrantHeight;

        XMoveResizeWindow(display, activeWindow, x, y, width, height);
        XFlush(display);
        XCloseDisplay(display);

        windowPositionIndex = (windowPositionIndex + 1) % 4;

        jclass cls = env->FindClass("org/local/model/WindowPosition");
        jmethodID constructor = env->GetMethodID(cls, "<init>", "(IIIII)V");
        jobject position = env->NewObject(cls, constructor, x, y, width, height, windowPositionIndex);

        return position;
    }

    JNIEXPORT jobject JNICALL Java_org_local_Configurations_SnapConfiguration_positionWindowInHalf(JNIEnv *env, jobject obj, jint x, jint y, jint width, jint height, jint windowPositionIndex) {

        Display *display = XOpenDisplay(NULL);
        Window activeWindow = XDefaultRootWindow(display);
        int screenWidth = XWidthOfScreen(XDefaultScreenOfDisplay(display));
        int screenHeight = XHeightOfScreen(XDefaultScreenOfDisplay(display));

        switch (windowPositionIndex) {
            case 0:
                x = 0;
                y = 0;
                width = screenWidth / 2;
                height = screenHeight;
                break;
            case 1:
                x = screenWidth / 2;
                y = 0;
                width = screenWidth / 2;
                height = screenHeight;
                break;
        }

        XMoveResizeWindow(display, activeWindow, x, y, width, height);
        XFlush(display);
        XCloseDisplay(display);

        windowPositionIndex = (windowPositionIndex + 1) % 2;

        jclass cls = env->FindClass("org/local/model/WindowPosition");
        jmethodID constructor = env->GetMethodID(cls, "<init>", "(IIIII)V");
        jobject position = env->NewObject(cls, constructor, x, y, width, height, windowPositionIndex);

        return position;
    }
}