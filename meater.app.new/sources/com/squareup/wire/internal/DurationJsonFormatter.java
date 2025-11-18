package com.squareup.wire.internal;

import Ub.n;
import java.time.Duration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DurationJsonFormatter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/squareup/wire/internal/DurationJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "()V", "fromString", "value", "", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DurationJsonFormatter implements JsonFormatter<Duration> {
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Duration fromString(String value) throws NumberFormatException {
        int i10;
        C3862t.g(value, "value");
        int iX = n.X(value, 's', 0, false, 6, null);
        if (iX != value.length() - 1) {
            throw new NumberFormatException();
        }
        int iX2 = n.X(value, '.', 0, false, 6, null);
        if (iX2 == -1) {
            String strSubstring = value.substring(0, iX);
            C3862t.f(strSubstring, "substring(...)");
            Duration durationOfSeconds = Duration.ofSeconds(Long.parseLong(strSubstring));
            C3862t.f(durationOfSeconds, "ofSeconds(...)");
            return durationOfSeconds;
        }
        String strSubstring2 = value.substring(0, iX2);
        C3862t.f(strSubstring2, "substring(...)");
        long j10 = Long.parseLong(strSubstring2);
        int i11 = iX2 + 1;
        String strSubstring3 = value.substring(i11, iX);
        C3862t.f(strSubstring3, "substring(...)");
        long j11 = Long.parseLong(strSubstring3);
        if (n.G(value, "-", false, 2, null)) {
            j11 = -j11;
        }
        int i12 = iX - i11;
        int i13 = i12;
        while (true) {
            if (i13 >= 9) {
                break;
            }
            j11 *= 10;
            i13++;
        }
        for (i10 = 9; i10 < i12; i10++) {
            j11 /= 10;
        }
        Duration durationOfSeconds2 = Duration.ofSeconds(j10, j11);
        C3862t.f(durationOfSeconds2, "ofSeconds(...)");
        return durationOfSeconds2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(Duration value) {
        String str;
        C3862t.g(value, "value");
        long seconds = value.getSeconds();
        int nano = value.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = "-";
            }
            if (nano != 0) {
                seconds--;
                nano = 1000000000 - nano;
            }
        } else {
            str = "";
        }
        if (nano == 0) {
            String str2 = String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2));
            C3862t.f(str2, "format(...)");
            return str2;
        }
        if (nano % 1000000 == 0) {
            String str3 = String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000000)}, 3));
            C3862t.f(str3, "format(...)");
            return str3;
        }
        if (nano % 1000 == 0) {
            String str4 = String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000)}, 3));
            C3862t.f(str4, "format(...)");
            return str4;
        }
        String str5 = String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
        C3862t.f(str5, "format(...)");
        return str5;
    }
}
