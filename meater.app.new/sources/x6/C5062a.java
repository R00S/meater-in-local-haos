package x6;

import java.io.File;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;

/* compiled from: FileDecoder.java */
/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5062a implements InterfaceC3974i<File, File> {
    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<File> a(File file, int i10, int i11, C3972g c3972g) {
        return new b(file);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file, C3972g c3972g) {
        return true;
    }
}
