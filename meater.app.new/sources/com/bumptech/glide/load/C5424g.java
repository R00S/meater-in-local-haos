package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MultiTransformation.java */
/* renamed from: com.bumptech.glide.load.g */
/* loaded from: classes.dex */
public class C5424g<T> implements InterfaceC5429l<T> {

    /* renamed from: b */
    private final Collection<? extends InterfaceC5429l<T>> f13556b;

    @SafeVarargs
    public C5424g(InterfaceC5429l<T>... interfaceC5429lArr) {
        if (interfaceC5429lArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f13556b = Arrays.asList(interfaceC5429lArr);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (obj instanceof C5424g) {
            return this.f13556b.equals(((C5424g) obj).f13556b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return this.f13556b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC5429l
    public InterfaceC5404u<T> transform(Context context, InterfaceC5404u<T> interfaceC5404u, int i2, int i3) {
        Iterator<? extends InterfaceC5429l<T>> it = this.f13556b.iterator();
        InterfaceC5404u<T> interfaceC5404u2 = interfaceC5404u;
        while (it.hasNext()) {
            InterfaceC5404u<T> interfaceC5404uTransform = it.next().transform(context, interfaceC5404u2, i2, i3);
            if (interfaceC5404u2 != null && !interfaceC5404u2.equals(interfaceC5404u) && !interfaceC5404u2.equals(interfaceC5404uTransform)) {
                interfaceC5404u2.mo10340c();
            }
            interfaceC5404u2 = interfaceC5404uTransform;
        }
        return interfaceC5404u2;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Iterator<? extends InterfaceC5429l<T>> it = this.f13556b.iterator();
        while (it.hasNext()) {
            it.next().updateDiskCacheKey(messageDigest);
        }
    }
}
