package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0620a;
import java.util.List;

/* compiled from: OpReorderer.java */
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
class C0632m {

    /* renamed from: a */
    final a f4206a;

    /* compiled from: OpReorderer.java */
    /* renamed from: androidx.recyclerview.widget.m$a */
    interface a {
        /* renamed from: a */
        void mo4417a(C0620a.b bVar);

        /* renamed from: b */
        C0620a.b mo4418b(int i2, int i3, int i4, Object obj);
    }

    C0632m(a aVar) {
        this.f4206a = aVar;
    }

    /* renamed from: a */
    private int m4524a(List<C0620a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4072a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m4525c(List<C0620a.b> list, int i2, C0620a.b bVar, int i3, C0620a.b bVar2) {
        int i4 = bVar.f4075d;
        int i5 = bVar2.f4073b;
        int i6 = i4 < i5 ? -1 : 0;
        int i7 = bVar.f4073b;
        if (i7 < i5) {
            i6++;
        }
        if (i5 <= i7) {
            bVar.f4073b = i7 + bVar2.f4075d;
        }
        int i8 = bVar2.f4073b;
        if (i8 <= i4) {
            bVar.f4075d = i4 + bVar2.f4075d;
        }
        bVar2.f4073b = i8 + i6;
        list.set(i2, bVar2);
        list.set(i3, bVar);
    }

    /* renamed from: d */
    private void m4526d(List<C0620a.b> list, int i2, int i3) {
        C0620a.b bVar = list.get(i2);
        C0620a.b bVar2 = list.get(i3);
        int i4 = bVar2.f4072a;
        if (i4 == 1) {
            m4525c(list, i2, bVar, i3, bVar2);
        } else if (i4 == 2) {
            m4528e(list, i2, bVar, i3, bVar2);
        } else {
            if (i4 != 4) {
                return;
            }
            m4529f(list, i2, bVar, i3, bVar2);
        }
    }

    /* renamed from: b */
    void m4527b(List<C0620a.b> list) {
        while (true) {
            int iM4524a = m4524a(list);
            if (iM4524a == -1) {
                return;
            } else {
                m4526d(list, iM4524a, iM4524a + 1);
            }
        }
    }

    /* renamed from: e */
    void m4528e(List<C0620a.b> list, int i2, C0620a.b bVar, int i3, C0620a.b bVar2) {
        boolean z;
        int i4 = bVar.f4073b;
        int i5 = bVar.f4075d;
        boolean z2 = false;
        if (i4 < i5) {
            if (bVar2.f4073b == i4 && bVar2.f4075d == i5 - i4) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f4073b == i5 + 1 && bVar2.f4075d == i4 - i5) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i6 = bVar2.f4073b;
        if (i5 < i6) {
            bVar2.f4073b = i6 - 1;
        } else {
            int i7 = bVar2.f4075d;
            if (i5 < i6 + i7) {
                bVar2.f4075d = i7 - 1;
                bVar.f4072a = 2;
                bVar.f4075d = 1;
                if (bVar2.f4075d == 0) {
                    list.remove(i3);
                    this.f4206a.mo4417a(bVar2);
                    return;
                }
                return;
            }
        }
        int i8 = bVar.f4073b;
        int i9 = bVar2.f4073b;
        C0620a.b bVarMo4418b = null;
        if (i8 <= i9) {
            bVar2.f4073b = i9 + 1;
        } else {
            int i10 = bVar2.f4075d;
            if (i8 < i9 + i10) {
                bVarMo4418b = this.f4206a.mo4418b(2, i8 + 1, (i9 + i10) - i8, null);
                bVar2.f4075d = bVar.f4073b - bVar2.f4073b;
            }
        }
        if (z2) {
            list.set(i2, bVar2);
            list.remove(i3);
            this.f4206a.mo4417a(bVar);
            return;
        }
        if (z) {
            if (bVarMo4418b != null) {
                int i11 = bVar.f4073b;
                if (i11 > bVarMo4418b.f4073b) {
                    bVar.f4073b = i11 - bVarMo4418b.f4075d;
                }
                int i12 = bVar.f4075d;
                if (i12 > bVarMo4418b.f4073b) {
                    bVar.f4075d = i12 - bVarMo4418b.f4075d;
                }
            }
            int i13 = bVar.f4073b;
            if (i13 > bVar2.f4073b) {
                bVar.f4073b = i13 - bVar2.f4075d;
            }
            int i14 = bVar.f4075d;
            if (i14 > bVar2.f4073b) {
                bVar.f4075d = i14 - bVar2.f4075d;
            }
        } else {
            if (bVarMo4418b != null) {
                int i15 = bVar.f4073b;
                if (i15 >= bVarMo4418b.f4073b) {
                    bVar.f4073b = i15 - bVarMo4418b.f4075d;
                }
                int i16 = bVar.f4075d;
                if (i16 >= bVarMo4418b.f4073b) {
                    bVar.f4075d = i16 - bVarMo4418b.f4075d;
                }
            }
            int i17 = bVar.f4073b;
            if (i17 >= bVar2.f4073b) {
                bVar.f4073b = i17 - bVar2.f4075d;
            }
            int i18 = bVar.f4075d;
            if (i18 >= bVar2.f4073b) {
                bVar.f4075d = i18 - bVar2.f4075d;
            }
        }
        list.set(i2, bVar2);
        if (bVar.f4073b != bVar.f4075d) {
            list.set(i3, bVar);
        } else {
            list.remove(i3);
        }
        if (bVarMo4418b != null) {
            list.add(i2, bVarMo4418b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m4529f(java.util.List<androidx.recyclerview.widget.C0620a.b> r9, int r10, androidx.recyclerview.widget.C0620a.b r11, int r12, androidx.recyclerview.widget.C0620a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f4075d
            int r1 = r13.f4073b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f4073b = r1
            goto L20
        Ld:
            int r5 = r13.f4075d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f4075d = r5
            androidx.recyclerview.widget.m$a r0 = r8.f4206a
            int r1 = r11.f4073b
            java.lang.Object r5 = r13.f4074c
            androidx.recyclerview.widget.a$b r0 = r0.mo4418b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f4073b
            int r5 = r13.f4073b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f4073b = r5
            goto L41
        L2b:
            int r6 = r13.f4075d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.m$a r3 = r8.f4206a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f4074c
            androidx.recyclerview.widget.a$b r3 = r3.mo4418b(r2, r1, r5, r4)
            int r1 = r13.f4075d
            int r1 = r1 - r5
            r13.f4075d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4075d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.m$a r11 = r8.f4206a
            r11.mo4417a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0632m.m4529f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
