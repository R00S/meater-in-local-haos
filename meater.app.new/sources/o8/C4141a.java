package o8;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* compiled from: BigIntegerMath.java */
/* renamed from: o8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4141a {

    /* renamed from: a, reason: collision with root package name */
    static final BigInteger f46577a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b, reason: collision with root package name */
    private static final double f46578b = Math.log(10.0d);

    /* renamed from: c, reason: collision with root package name */
    private static final double f46579c = Math.log(2.0d);

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
