#include <jni.h>
#include <org_local_Configurations_SnapConfiguration.h>
#include <Windows.h>

/**
 * WindowsSnapConfiguration class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

extern "C" {

    JNIEXPORT jobject JNICALL Java_org_local_Configurations_SnapConfiguration_positionWindowInCorner(JNIEnv * env, jobject obj, jint x, jint y, jint width, jint height, jint windowPositionIndex) {

        HWND hWnd = GetActiveWindow();
        HDC hdc = GetDC(hWnd);

        int dpiX = GetDeviceCaps(hdc, LOGPIXELSX);
        int dpiY = GetDeviceCaps(hdc, LOGPIXELSY);

        int screenWidth = GetSystemMetrics(SM_CXSCREEN);
        int screenHeight = GetSystemMetrics(SM_CYSCREEN);

        // Ajustar as dimensões da tela para a escala da tela, a verificar
        screenWidth = MulDiv(screenWidth, 96, dpiX);
        screenHeight = MulDiv(screenHeight, 96, dpiY);

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

        MoveWindow(hWnd, x, y, width, height, TRUE);
        windowPositionIndex = (windowPositionIndex + 1) % 4;

        jclass cls = env->FindClass("org/local/model/WindowPosition");
        jmethodID constructor = env->GetMethodID(cls, "<init>", "(IIIII)V");
        jobject position = env->NewObject(cls, constructor, x, y, width, height, windowPositionIndex);

        ReleaseDC(hWnd, hdc);

        return position;
    }

    JNIEXPORT jobject JNICALL Java_org_local_Configurations_SnapConfiguration_positionWindowInHalf(JNIEnv * env, jobject obj, jint x, jint y, jint width, jint height, jint windowPositionIndex) {

        HWND hWnd = GetActiveWindow();
        HDC hdc = GetDC(hWnd);

        int dpiX = GetDeviceCaps(hdc, LOGPIXELSX);
        int dpiY = GetDeviceCaps(hdc, LOGPIXELSY);

        int screenWidth = GetSystemMetrics(SM_CXSCREEN);
        int screenHeight = GetSystemMetrics(SM_CYSCREEN);

        screenWidth = MulDiv(screenWidth, 96, dpiX);
        screenHeight = MulDiv(screenHeight, 96, dpiY);

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

        MoveWindow(hWnd, x, y, width, height, TRUE);
        windowPositionIndex = (windowPositionIndex + 1) % 2;

        jclass cls = env->FindClass("org/local/model/WindowPosition");
        jmethodID constructor = env->GetMethodID(cls, "<init>", "(IIIII)V");
        jobject position = env->NewObject(cls, constructor, x, y, width, height, windowPositionIndex);

        ReleaseDC(hWnd, hdc);

        return position;
    }
}