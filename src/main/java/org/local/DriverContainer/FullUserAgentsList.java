package org.local.DriverContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * FullUserAgentsList class.
 *
 * @author Wender Couto
 * @since 0.0.3 Beta
 */
public class FullUserAgentsList {

    public FullUserAgentsList() {}

    private static final List<String> USER_AGENTS = new ArrayList<>();

    /**
     * There may be a lot incompatible user-agents in use  */
    public static String getRandomUserAgent() {
        Random random = new Random();
        return USER_AGENTS.get(random.nextInt(USER_AGENTS.size()));
    }

    static {
        // Safari on Windows
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/14.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.2 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/5.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/4.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.2 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 7.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.2 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.1 Safari/537.36");
        // Safari windows 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 5.1; Win32; x32) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.2 Safari/537.36");
        // Safari macOS 14
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 14_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/16.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 14_0_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/16.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 14_1_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/16.1 Safari/537.36");
        // Safari macOS 13
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/15.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_1_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/15.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_2_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/15.2 Safari/537.36");
        // Safari macOS 12
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/14.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_1_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/14.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_2_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/14.2 Safari/537.36");
        // Safari macOS 11
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_1_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_2_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/13.2 Safari/537.36");
        // Safari macOS 10.15 (Catalina)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/12.2 Safari/537.36");
        // Safari macOS 10.14 (Mojave)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.2 Safari/537.36");
        // Safari macOS 10.13 (High Sierra)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.2 Safari/537.36");
        // Safari macOS 10.12 (Sierra)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.2 Safari/537.36");
        // Safari macOS 10.11 (El Capitan)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.2 Safari/537.36");
        // Safari macOS 10.10 (Yosemite)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.2 Safari/537.36");
        // Safari macOS 10.9 (Mavericks)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/6.2 Safari/537.36");
        // Safari macOS 10.8 (Mountain Lion)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/5.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/5.2 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/5.3 Safari/537.36");
        // Safari macOS 10.7 (Lion)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/5.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/5.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/5.2 Safari/537.36");
        // Safari macOS 10.6 (Snow Leopard)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_0) AppleWebKit/537.36 (KHTML); like Gecko) Version/4.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Version/4.1 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Version/4.2 Safari/537.36");
        // Safari linux
        USER_AGENTS.add("Mozilla/5.0 (X11; U; Linux x86_64; en-ca) AppleWebKit/531.2+ (KHTML); like Gecko) Version/5.0 Safari/531.2+");
        USER_AGENTS.add("Mozilla/5.0 (X11; U; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/58.0.3029.110 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:91.0) Gecko/20100101 Firefox/91.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/17.17134");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:84.0) Gecko/20100101 Firefox/84.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Version/11.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Version/10.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Version/9.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Version/8.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Version/7.0 Safari/537.36");
        // Chrome Windows 7 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Safari/537.36");
        // Chrome Windows 7 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Safari/537.36");
        // Chrome Windows 8.1 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Safari/537.36");
        // Chrome Windows 10 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Safari/537.36");
        // Chrome Windows 11 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Safari/537.36");
        // Chrome macOS Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13.0; rv:116.0) Gecko/20100101 Firefox/116.0");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13.0; rv:115.0) Gecko/20100101 Firefox/115.0");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/116.0.5845.96 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_5_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.5790.98 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.198 Safari/537.36");
        // Chrome macOS Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.147 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.5481.100 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.5414.87 Safari/537.36");
        // Chrome macOS Slightly Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.5359.124 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.5304.107 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.5249.103 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/105.0.5195.102 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/104.0.5112.102 Safari/537.36");
        // Chrome Linux Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Safari/537.36");
        // Chrome Linux Older Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/105.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/104.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/103.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/102.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/101.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/100.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/99.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/98.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/97.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/96.0.0.0 Safari/537.36");
        // Chrome Linux Slightly Older Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/95.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/94.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/93.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/92.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/86.0.0.0 Safari/537.36");
        // Chrome Linux Very Old Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/85.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/84.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/83.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/82.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/81.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/80.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/79.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/78.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/77.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/76.0.0.0 Safari/537.36");
        // Chrome Linux Legacy Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/75.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/74.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/73.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/72.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/71.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/70.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/69.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/68.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/67.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/66.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/65.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/64.0.0.0 Safari/537.36");
        // Chrome Android Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 14; Pixel 7 XL Build/TQ1A.230505.002) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 14; Pixel 7 XL Build/TQ1A.230505.002) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 13; Pixel 6 Pro Build/TQ1A.230205.002) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 13; Pixel 6 Build/TQ1A.220804.001) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; SM-G991U Build/SP1A.210812.016) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; SM-G991U Build/SP1A.210812.016) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; Pixel 5 Build/RQ2A.210305.006) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 11; SM-N975F Build/RP1A.200720.012) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 11; Pixel 4a Build/RQ2A.210305.006) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 10; SM-G970U Build/QP1A.190711.020) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Mobile Safari/537.36");
        // Chrome Android Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 10; Pixel 4 Build/QP1A.190711.020) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/105.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 9; SM-G960F Build/PPR1.180610.011) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/104.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 9; Pixel 3 XL Build/PKQ1.180904.001) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/103.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.1.0; Pixel 2 XL Build/OPM5.171019.012) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/102.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F Build/R16NW) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/101.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.1.2; Nexus 5X Build/N2G48C) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/100.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.1.1; Pixel Build/NMF26F) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/99.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 6.0.1; Nexus 5 Build/MTC20M) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/98.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 6.0; Nexus 5X Build/MTC20M) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/97.0.0.0 Mobile Safari/537.36");
        // Chrome Android Slightly Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 5.1; Nexus 6 Build/LMY48B) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/96.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 5.0.2; Nexus 4 Build/LRX22G) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/95.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 4.4.4; Nexus 7 Build/KTU84P) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/94.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 4.4.2; Nexus 10 Build/KOT49H) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/93.0.0.0 Mobile Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 4.3; Nexus 4 Build/JWR66V) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/92.0.0.0 Mobile Safari/537.36");
        // Firefox Windows 10 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:87.0) Gecko/20100101 Firefox/87.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:85.0) Gecko/20100101 Firefox/85.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:84.0) Gecko/20100101 Firefox/84.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:83.0) Gecko/20100101 Firefox/83.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:82.0) Gecko/20100101 Firefox/82.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:79.0) Gecko/20100101 Firefox/79.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:78.0) Gecko/20100101 Firefox/78.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:77.0) Gecko/20100101 Firefox/77.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:74.0) Gecko/20100101 Firefox/74.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:71.0) Gecko/20100101 Firefox/71.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:67.0) Gecko/20100101 Firefox/67.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:66.0) Gecko/20100101 Firefox/66.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:65.0) Gecko/20100101 Firefox/65.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:64.0) Gecko/20100101 Firefox/64.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:62.0) Gecko/20100101 Firefox/62.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:60.0) Gecko/20100101 Firefox/60.0");
        // Firefox Windows 10 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:90.0) Gecko/20100101 Firefox/90.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:89.0) Gecko/20100101 Firefox/89.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:88.0) Gecko/20100101 Firefox/88.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:87.0) Gecko/20100101 Firefox/87.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:86.0) Gecko/20100101 Firefox/86.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:85.0) Gecko/20100101 Firefox/85.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:84.0) Gecko/20100101 Firefox/84.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:83.0) Gecko/20100101 Firefox/83.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:82.0) Gecko/20100101 Firefox/82.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:81.0) Gecko/20100101 Firefox/81.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:80.0) Gecko/20100101 Firefox/80.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:79.0) Gecko/20100101 Firefox/79.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:78.0) Gecko/20100101 Firefox/78.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:77.0) Gecko/20100101 Firefox/77.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:76.0) Gecko/20100101 Firefox/76.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:75.0) Gecko/20100101 Firefox/75.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:74.0) Gecko/20100101 Firefox/74.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:73.0) Gecko/20100101 Firefox/73.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:72.0) Gecko/20100101 Firefox/72.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:71.0) Gecko/20100101 Firefox/71.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:69.0) Gecko/20100101 Firefox/69.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:68.0) Gecko/20100101 Firefox/68.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:67.0) Gecko/20100101 Firefox/67.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:66.0) Gecko/20100101 Firefox/66.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:65.0) Gecko/20100101 Firefox/65.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:64.0) Gecko/20100101 Firefox/64.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:63.0) Gecko/20100101 Firefox/63.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:62.0) Gecko/20100101 Firefox/62.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:61.0) Gecko/20100101 Firefox/61.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:60.0) Gecko/20100101 Firefox/60.0");
        // Firefox Windows 8.1 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:87.0) Gecko/20100101 Firefox/87.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:85.0) Gecko/20100101 Firefox/85.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:84.0) Gecko/20100101 Firefox/84.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:83.0) Gecko/20100101 Firefox/83.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:82.0) Gecko/20100101 Firefox/82.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:79.0) Gecko/20100101 Firefox/79.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:78.0) Gecko/20100101 Firefox/78.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:77.0) Gecko/20100101 Firefox/77.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:74.0) Gecko/20100101 Firefox/74.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:71.0) Gecko/20100101 Firefox/71.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:67.0) Gecko/20100101 Firefox/67.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:66.0) Gecko/20100101 Firefox/66.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:65.0) Gecko/20100101 Firefox/65.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:64.0) Gecko/20100101 Firefox/64.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:62.0) Gecko/20100101 Firefox/62.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:60.0) Gecko/20100101 Firefox/60.0");
        // Firefox Windows 8.1 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:90.0) Gecko/20100101 Firefox/90.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:89.0) Gecko/20100101 Firefox/89.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:88.0) Gecko/20100101 Firefox/88.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:87.0) Gecko/20100101 Firefox/87.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:86.0) Gecko/20100101 Firefox/86.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:85.0) Gecko/20100101 Firefox/85.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:84.0) Gecko/20100101 Firefox/84.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:83.0) Gecko/20100101 Firefox/83.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:82.0) Gecko/20100101 Firefox/82.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:81.0) Gecko/20100101 Firefox/81.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:80.0) Gecko/20100101 Firefox/80.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:79.0) Gecko/20100101 Firefox/79.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:78.0) Gecko/20100101 Firefox/78.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:77.0) Gecko/20100101 Firefox/77.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:76.0) Gecko/20100101 Firefox/76.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:75.0) Gecko/20100101 Firefox/75.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:74.0) Gecko/20100101 Firefox/74.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:73.0) Gecko/20100101 Firefox/73.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:72.0) Gecko/20100101 Firefox/72.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:71.0) Gecko/20100101 Firefox/71.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:69.0) Gecko/20100101 Firefox/69.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:68.0) Gecko/20100101 Firefox/68.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:67.0) Gecko/20100101 Firefox/67.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:66.0) Gecko/20100101 Firefox/66.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:65.0) Gecko/20100101 Firefox/65.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:64.0) Gecko/20100101 Firefox/64.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:63.0) Gecko/20100101 Firefox/63.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:62.0) Gecko/20100101 Firefox/62.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:61.0) Gecko/20100101 Firefox/61.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:60.0) Gecko/20100101 Firefox/60.0");
        // Firefox Windows 8 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:87.0) Gecko/20100101 Firefox/87.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:85.0) Gecko/20100101 Firefox/85.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:84.0) Gecko/20100101 Firefox/84.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:83.0) Gecko/20100101 Firefox/83.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:82.0) Gecko/20100101 Firefox/82.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:79.0) Gecko/20100101 Firefox/79.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:78.0) Gecko/20100101 Firefox/78.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:77.0) Gecko/20100101 Firefox/77.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:74.0) Gecko/20100101 Firefox/74.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:71.0) Gecko/20100101 Firefox/71.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:67.0) Gecko/20100101 Firefox/67.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:66.0) Gecko/20100101 Firefox/66.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:65.0) Gecko/20100101 Firefox/65.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:64.0) Gecko/20100101 Firefox/64.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:62.0) Gecko/20100101 Firefox/62.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:60.0) Gecko/20100101 Firefox/60.0");
        // Firefox Windows 7 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:87.0) Gecko/20100101 Firefox/87.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:85.0) Gecko/20100101 Firefox/85.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:84.0) Gecko/20100101 Firefox/84.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:83.0) Gecko/20100101 Firefox/83.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:82.0) Gecko/20100101 Firefox/82.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:79.0) Gecko/20100101 Firefox/79.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:78.0) Gecko/20100101 Firefox/78.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:77.0) Gecko/20100101 Firefox/77.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:74.0) Gecko/20100101 Firefox/74.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:71.0) Gecko/20100101 Firefox/71.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:67.0) Gecko/20100101 Firefox/67.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:66.0) Gecko/20100101 Firefox/66.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:65.0) Gecko/20100101 Firefox/65.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:64.0) Gecko/20100101 Firefox/64.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:62.0) Gecko/20100101 Firefox/62.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:60.0) Gecko/20100101 Firefox/60.0");
        // Firefox Windows 7 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:90.0) Gecko/20100101 Firefox/90.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:89.0) Gecko/20100101 Firefox/89.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:88.0) Gecko/20100101 Firefox/88.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:87.0) Gecko/20100101 Firefox/87.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:86.0) Gecko/20100101 Firefox/86.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:85.0) Gecko/20100101 Firefox/85.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:84.0) Gecko/20100101 Firefox/84.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:83.0) Gecko/20100101 Firefox/83.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:82.0) Gecko/20100101 Firefox/82.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:81.0) Gecko/20100101 Firefox/81.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:80.0) Gecko/20100101 Firefox/80.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:79.0) Gecko/20100101 Firefox/79.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:78.0) Gecko/20100101 Firefox/78.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:77.0) Gecko/20100101 Firefox/77.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:76.0) Gecko/20100101 Firefox/76.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:75.0) Gecko/20100101 Firefox/75.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:74.0) Gecko/20100101 Firefox/74.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:73.0) Gecko/20100101 Firefox/73.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:72.0) Gecko/20100101 Firefox/72.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:71.0) Gecko/20100101 Firefox/71.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:69.0) Gecko/20100101 Firefox/69.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:68.0) Gecko/20100101 Firefox/68.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:67.0) Gecko/20100101 Firefox/67.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:66.0) Gecko/20100101 Firefox/66.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:65.0) Gecko/20100101 Firefox/65.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:64.0) Gecko/20100101 Firefox/64.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:63.0) Gecko/20100101 Firefox/63.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:62.0) Gecko/20100101 Firefox/62.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:61.0) Gecko/20100101 Firefox/61.0");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:60.0) Gecko/20100101 Firefox/60.0");
        // Opera Windows 10 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        // Opera Windows 10 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        // Opera Windows 8.1 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        // Opera Windows 8.1 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        // Opera Windows 7 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        // Opera Windows 7 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        // Opera macOS Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13.0; rv:77.0) Gecko/20100101 Firefox/77.0 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_5_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        // Opera macOS Slightly Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/86.0.4240.198 Safari/537.36 OPR/72.0.3815.400");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/85.0.4183.121 Safari/537.36 OPR/71.0.3770.149");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/84.0.4147.125 Safari/537.36 OPR/70.0.3728.106");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/83.0.4103.106 Safari/537.36 OPR/69.0.3686.77");
        // Opera Linux Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 Safari/537.36 OPR/77.0.4054.277");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 Safari/537.36 OPR/76.0.4017.177");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 Safari/537.36 OPR/75.0.3969.243");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 Safari/537.36 OPR/74.0.3911.232");
        USER_AGENTS.add("Mozilla/5.0 (X11; Debian; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.344");
        // Opera Linux Slightly Older Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/86.0.4240.198 Safari/537.36 OPR/72.0.3815.400");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/85.0.4183.121 Safari/537.36 OPR/71.0.3770.149");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/84.0.4147.125 Safari/537.36 OPR/70.0.3728.106");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/83.0.4103.106 Safari/537.36 OPR/69.0.3686.77");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; en-US) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/82.0.4085.88 Safari/537.36 OPR/68.0.3618.125");
        // Opera Android Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 13; Pixel 6 XL Build/TQ1A.230205.001) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.130 Mobile Safari/537.36 OPR/95.0.4635.77");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; SM-G991B Build/SQ1A.220205.017) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.91 Mobile Safari/537.36 OPR/94.0.4606.64");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 11; SM-G998B Build/RP1A.200720.012) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.111 Mobile Safari/537.36 OPR/93.0.4577.73");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 10; Pixel 5 Build/QP1A.190711.020) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.141 Mobile Safari/537.36 OPR/92.0.4515.115");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 9; SM-G960F Build/PPR1.180610.011) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.5481.177 Mobile Safari/537.36 OPR/91.0.4472.97");
        // Opera Android Slightly Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.1.0; Moto G6 Build/OPM1.171019.011) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.5414.75 Mobile Safari/537.36 OPR/90.0.4430.72");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.0.0; Nexus 5X Build/OPD1.170816.012) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.5359.125 Mobile Safari/537.36 OPR/89.0.4376.74");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.1.2; LG-H870 Build/N2G48B) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.5278.109 Mobile Safari/537.36 OPR/88.0.4296.48");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.0; HTC 10 Build/NRD90M) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.5249.103 Mobile Safari/537.36 OPR/87.0.4238.60");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 6.0; SM-G920V Build/MRA58K) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/105.0.5195.129 Mobile Safari/537.36 OPR/86.0.4190.68");
        // Opera Android Recent Versions - Samsung Devices
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 13; Samsung Galaxy S23 Ultra Build/SKQ1.220912.001) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Mobile Safari/537.36 OPR/95.0.4635.77");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; Samsung Galaxy S21 Build/SP1A.210812.016) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.130 Mobile Safari/537.36 OPR/94.0.4606.64");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 11; Samsung Galaxy Note 20 Build/RP1A.200720.012) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.91 Mobile Safari/537.36 OPR/93.0.4577.73");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 10; Samsung Galaxy S10 Build/QP1A.190711.020) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.111 Mobile Safari/537.36 OPR/92.0.4515.115");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 9; Samsung Galaxy S8 Build/PPR1.180610.011) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.141 Mobile Safari/537.36 OPR/91.0.4472.97");
        // Opera Android Slightly Older Versions - Samsung Devices
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.1.0; Samsung Galaxy S7 Build/OPM1.171019.011) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.5414.75 Mobile Safari/537.36 OPR/90.0.4430.72");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.0.0; Samsung Galaxy Note 8 Build/OPD1.170816.012) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.5359.125 Mobile Safari/537.36 OPR/89.0.4376.74");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.1.2; Samsung Galaxy S6 Build/N2G48B) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.5278.109 Mobile Safari/537.36 OPR/88.0.4296.48");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.0; Samsung Galaxy J7 Build/NRD90M) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.5249.103 Mobile Safari/537.36 OPR/87.0.4238.60");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 6.0; Samsung Galaxy A5 Build/MRA58K) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/105.0.5195.129 Mobile Safari/537.36 OPR/86.0.4190.68");
        // Microsoft Edge Windows 11 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge Windows 10 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge Windows 8.1 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge Windows 7 64-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge Windows 7 32-bit
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; Trident/7.0; AS; rv:11.0) like Gecko");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; Trident/7.0; AS; rv:10.0) like Gecko");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; Trident/6.0; AS; rv:9.0) like Gecko");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; Trident/5.0; AS; rv:8.0) like Gecko");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 6.1; Win32; Trident/4.0; AS; rv:7.0) like Gecko");
        // Microsoft Edge macOS 13 (Ventura)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge macOS 12 (Monterey)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge macOS 11 (Big Sur)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge macOS 10 (Catalina)
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.5735.110 Safari/537.36 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.5672.126 Safari/537.36 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.5615.138 Safari/537.36 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.5563.146 Safari/537.36 Edg/111.0.1661.54");
        // Microsoft Edge Linux - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:115.0) Gecko/20100101 Firefox/115.0 Edg/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:114.0) Gecko/20100101 Firefox/114.0 Edg/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:113.0) Gecko/20100101 Firefox/113.0 Edg/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:112.0) Gecko/20100101 Firefox/112.0 Edg/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:111.0) Gecko/20100101 Firefox/111.0 Edg/111.0.1661.54");
        // Microsoft Edge Linux - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:110.0) Gecko/20100101 Firefox/110.0 Edg/110.0.1504.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:109.0) Gecko/20100101 Firefox/109.0 Edg/109.0.1418.56");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:108.0) Gecko/20100101 Firefox/108.0 Edg/108.0.1462.42");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:107.0) Gecko/20100101 Firefox/107.0 Edg/107.0.1418.56");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:106.0) Gecko/20100101 Firefox/106.0 Edg/106.0.1370.42");
        // Microsoft Edge Android - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 14; SM-G991U) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Mobile Safari/537.36 EdgA/115.0.1901.183");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 13; Pixel 6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36 EdgA/114.0.1823.79");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; SM-G991U) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Mobile Safari/537.36 EdgA/113.0.1774.50");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36 EdgA/112.0.1722.64");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 10; SM-G960U) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Mobile Safari/537.36 EdgA/111.0.1661.54");
        // Microsoft Edge Android - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 9; SM-G950F) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Mobile Safari/537.36 EdgA/110.0.1504.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.1.0; Moto G (4) Build/OPP27.91) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Mobile Safari/537.36 EdgA/109.0.1418.56");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.0.0; LG-H872 Build/OPM1.171019.019) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Mobile Safari/537.36 EdgA/108.0.1462.42");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.1.2; Nexus 5X Build/NPG05E) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Mobile Safari/537.36 EdgA/107.0.1418.56");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 7.0; SM-J700F Build/NRD90M) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Mobile Safari/537.36 EdgA/106.0.1370.42");
        // Vivaldi Windows - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.9.2567.48 Chrome/115.0.5790.98 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.8.2958.48 Chrome/114.0.5735.198 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.7.2921.60 Chrome/113.0.5672.126 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.6.2867.52 Chrome/112.0.5615.138 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.5.2808.36 Chrome/111.0.5563.147 Safari/537.36");
        // Vivaldi Windows - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.4.2758.48 Chrome/110.0.5481.100 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.3.2731.47 Chrome/109.0.5414.87 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.2.2679.53 Chrome/108.0.5359.124 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.1.2615.50 Chrome/107.0.5304.107 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.0.2567.60 Chrome/106.0.5249.103 Safari/537.36");
        // Vivaldi macOS - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13.0; rv:5.9.2567.48) Gecko/20100101 Firefox/5.9.2567.48");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.8.2958.48 Chrome/114.0.5735.198 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_5_1) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.7.2921.60 Chrome/113.0.5672.126 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.6.2867.52 Chrome/112.0.5615.138 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.5.2808.36 Chrome/111.0.5563.147 Safari/537.36");
        // Vivaldi macOS - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.4.2758.48 Chrome/110.0.5481.100 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.3.2731.47 Chrome/109.0.5414.87 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.2.2679.53 Chrome/108.0.5359.124 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.1.2615.50 Chrome/107.0.5304.107 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML); like Gecko) Vivaldi/5.0.2567.60 Chrome/106.0.5249.103 Safari/537.36");
        // Vivaldi Linux - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; rv:5.9.2567.48) Gecko/20100101 Firefox/5.9.2567.48");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.8.2958.48) Gecko/20100101 Firefox/5.8.2958.48");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.7.2921.60) Gecko/20100101 Firefox/5.7.2921.60");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.6.2867.52) Gecko/20100101 Firefox/5.6.2867.52");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.5.2808.36) Gecko/20100101 Firefox/5.5.2808.36");
        // Vivaldi Linux - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.4.2758.48) Gecko/20100101 Firefox/5.4.2758.48");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.3.2731.47) Gecko/20100101 Firefox/5.3.2731.47");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.2.2679.53) Gecko/20100101 Firefox/5.2.2679.53");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.1.2615.50) Gecko/20100101 Firefox/5.1.2615.50");
        USER_AGENTS.add("Mozilla/5.0 (X11; Linux x86_64; Ubuntu; rv:5.0.2567.60) Gecko/20100101 Firefox/5.0.2567.60");
        // UC Browser Windows - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/91.0.4472.124 UC Browser/13.3.8.1307 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/90.0.4430.212 UC Browser/13.2.8.1285 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/89.0.4389.82 UC Browser/13.1.8.1262 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/88.0.4324.150 UC Browser/13.0.8.1249 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/87.0.4280.88 UC Browser/12.12.8.1238 Safari/537.36");
        // UC Browser Windows - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/85.0.4183.121 UC Browser/12.10.8.1223 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/84.0.4147.105 UC Browser/12.9.8.1219 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/83.0.4103.106 UC Browser/12.8.8.1208 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/82.0.4085.118 UC Browser/12.7.8.1197 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/81.0.4044.129 UC Browser/12.6.8.1185 Safari/537.36");
        // Brave Windows - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Brave/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Brave/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Brave/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Brave/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Brave/111.0.0.0 Safari/537.36");
        // Brave Windows - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Brave/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Brave/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Brave/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Brave/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Brave/106.0.0.0 Safari/537.36");
        // Brave macOS - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0_0) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Brave/115.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_6_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Brave/114.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 12_5_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Brave/113.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_6_2) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Brave/112.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 11_5_1) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Brave/111.0.0.0 Safari/537.36");
        // Brave macOS - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Brave/110.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Brave/109.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Brave/108.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Brave/107.0.0.0 Safari/537.36");
        USER_AGENTS.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Brave/106.0.0.0 Safari/537.36");
        // Brave Linux - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:115.0) Gecko/20100101 Firefox/115.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:114.0) Gecko/20100101 Firefox/114.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:113.0) Gecko/20100101 Firefox/113.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:112.0) Gecko/20100101 Firefox/112.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:111.0) Gecko/20100101 Firefox/111.0");
        // Brave Linux - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:110.0) Gecko/20100101 Firefox/110.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:109.0) Gecko/20100101 Firefox/109.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:108.0) Gecko/20100101 Firefox/108.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:107.0) Gecko/20100101 Firefox/107.0");
        USER_AGENTS.add("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:106.0) Gecko/20100101 Firefox/106.0");
        // Brave Android - Recent Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 13; SM-G991B) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/115.0.0.0 Mobile Safari/537.36 Brave/115.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; SM-G986B) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36 Brave/114.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/113.0.0.0 Mobile Safari/537.36 Brave/113.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 11; SM-A515F) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36 Brave/112.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 11; Pixel 4a) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/111.0.0.0 Mobile Safari/537.36 Brave/111.0.0.0");
        // Brave Android - Older Versions
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 10; SM-A505F) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/110.0.0.0 Mobile Safari/537.36 Brave/110.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 10; Pixel 4) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/109.0.0.0 Mobile Safari/537.36 Brave/109.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 9; SM-G970F) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/108.0.0.0 Mobile Safari/537.36 Brave/108.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 9; Pixel 3) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/107.0.0.0 Mobile Safari/537.36 Brave/107.0.0.0");
        USER_AGENTS.add("Mozilla/5.0 (Linux; Android 8.1; SM-J600G) AppleWebKit/537.36 (KHTML); like Gecko) Chrome/106.0.0.0 Mobile Safari/537.36 Brave/106.0.0.0");
    }
}