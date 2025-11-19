package org.eclipse.paho.android.service;

import Fc.m;
import java.util.Iterator;

/* compiled from: MessageStore.java */
/* loaded from: classes3.dex */
interface c {

    /* compiled from: MessageStore.java */
    public interface a {
        m a();

        String b();

        String c();
    }

    Iterator<a> a(String str);

    String b(String str, String str2, m mVar);

    boolean c(String str, String str2);

    void close();

    void d(String str);
}
