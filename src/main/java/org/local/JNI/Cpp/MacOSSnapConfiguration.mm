#include <jni.h>
#include <org_local_Configurations_SnapConfiguration.h>
#include <Cocoa/Cocoa.h>

/**
 * MacOSSnapConfiguration class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

extern "C" {

    JNIEXPORT jobject JNICALL Java_org_local_Configurations_SnapConfiguration_positionWindowInCorner(JNIEnv *env, jobject obj, jint x, jint y, jint width, jint height, jint windowPositionIndex) {

        NSWindow *activeWindow = [[NSApplication sharedApplication] keyWindow];
        NSScreen *mainScreen = [NSScreen mainScreen];
        NSRect screenRect = [mainScreen frame];

        int screenWidth = (int)screenRect.size.width;
        int screenHeight = (int)screenRect.size.height;

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

        [activeWindow setFrame:NSMakeRect(x, y, width, height) display:YES];

        jclass cls = env->FindClass("org/local/model/WindowPosition");
        jmethodID constructor = env->GetMethodID(cls, "<init>", "(IIIII)V");
        jobject position = env->NewObject(cls, constructor, x, y, width, height, windowPositionIndex);

        return position;
    }

    JNIEXPORT jobject JNICALL Java_org_local_Configurations_SnapConfiguration_positionWindowInHalf(JNIEnv *env, jobject obj, jint x, jint y, jint width, jint height, jint windowPositionIndex) {

        NSWindow *activeWindow = [[NSApplication sharedApplication] keyWindow];
        NSScreen *mainScreen = [NSScreen mainScreen];
        NSRect screenRect = [mainScreen frame];

        int screenWidth = (int)screenRect.size.width;
        int screenHeight = (int)screenRect.size.height;

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

        [activeWindow setFrame:NSMakeRect(x, y, width, height) display:YES];

        jclass cls = env->FindClass("org/local/model/WindowPosition");
        jmethodID constructor = env->GetMethodID(cls, "<init>", "(IIIII)V");
        jobject position = env->NewObject(cls, constructor, x, y, width, height, windowPositionIndex);

        return position;
    }
}