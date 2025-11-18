package cm.aptoide.p092pt.utils;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class IdUtils {
    private static final String TAG = "IdUtils";
    private static final SecureRandom random = new SecureRandom();
    private static final AtomicLong sequentialLongId = new AtomicLong();
    private final AtomicLong longId;

    public IdUtils(long j2) {
        this.longId = new AtomicLong(j2);
    }

    public static long nextSequentialLong() {
        return sequentialLongId.incrementAndGet();
    }

    public static long randomLong() {
        return random.nextLong();
    }

    public static String randomString() {
        byte[] bArr = new byte[32];
        random.nextBytes(bArr);
        return Arrays.toString(Base64.encode(bArr, 8));
    }

    public long nextLong() {
        return this.longId.incrementAndGet();
    }
}
