package Fa;

import java.util.Random;
import kotlin.Metadata;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LFa/a;", "LFa/c;", "<init>", "()V", "", "b", "()I", "until", "c", "(I)I", "Ljava/util/Random;", "d", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // Fa.c
    public int b() {
        return d().nextInt();
    }

    @Override // Fa.c
    public int c(int until) {
        return d().nextInt(until);
    }

    public abstract Random d();
}
