package ca;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IdUtils.java */
/* renamed from: ca.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2354c {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f31124a = new AtomicInteger(1);

    public static int a() {
        return View.generateViewId();
    }
}
