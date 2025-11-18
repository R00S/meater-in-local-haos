package p241e.p307h.p308a.p310f0;

import android.util.SparseArray;
import com.liulishuo.filedownloader.model.C8699a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p315k0.C9034d;

/* compiled from: NoDatabaseImpl.java */
/* renamed from: e.h.a.f0.b */
/* loaded from: classes2.dex */
public class C9006b implements InterfaceC9005a {

    /* renamed from: a */
    final SparseArray<FileDownloadModel> f34640a = new SparseArray<>();

    /* renamed from: b */
    final SparseArray<List<C8699a>> f34641b = new SparseArray<>();

    /* compiled from: NoDatabaseImpl.java */
    /* renamed from: e.h.a.f0.b$a */
    class a implements InterfaceC9005a.a {
        a() {
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a.a
        /* renamed from: K */
        public void mo28743K(FileDownloadModel fileDownloadModel) {
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a.a
        /* renamed from: T */
        public void mo28744T(FileDownloadModel fileDownloadModel) {
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a.a
        /* renamed from: T0 */
        public void mo28745T0() {
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a.a
        /* renamed from: f0 */
        public void mo28746f0(int i2, FileDownloadModel fileDownloadModel) {
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            return C9006b.this.new b();
        }
    }

    /* compiled from: NoDatabaseImpl.java */
    /* renamed from: e.h.a.f0.b$b */
    class b implements Iterator<FileDownloadModel> {
        b() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel next() {
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: a */
    public void mo28726a(int i2) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: b */
    public InterfaceC9005a.a mo28727b() {
        return new a();
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: c */
    public void mo28728c(int i2, Throwable th) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    public void clear() {
        synchronized (this.f34640a) {
            this.f34640a.clear();
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: d */
    public void mo28729d(int i2, long j2) {
        remove(i2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: e */
    public void mo28730e(int i2, String str, long j2, long j3, int i3) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: f */
    public void mo28731f(int i2, int i3, long j2) {
        synchronized (this.f34641b) {
            List<C8699a> list = this.f34641b.get(i2);
            if (list == null) {
                return;
            }
            for (C8699a c8699a : list) {
                if (c8699a.m27589d() == i3) {
                    c8699a.m27591g(j2);
                    return;
                }
            }
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: g */
    public void mo28732g(C8699a c8699a) {
        int iM27588c = c8699a.m27588c();
        synchronized (this.f34641b) {
            List<C8699a> arrayList = this.f34641b.get(iM27588c);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f34641b.put(iM27588c, arrayList);
            }
            arrayList.add(c8699a);
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: h */
    public void mo28733h(int i2) {
        synchronized (this.f34641b) {
            this.f34641b.remove(i2);
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: i */
    public void mo28734i(int i2) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: j */
    public void mo28735j(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            C9034d.m28970i(this, "update but model == null!", new Object[0]);
            return;
        }
        if (mo28740o(fileDownloadModel.m27561e()) == null) {
            m28747r(fileDownloadModel);
            return;
        }
        synchronized (this.f34640a) {
            this.f34640a.remove(fileDownloadModel.m27561e());
            this.f34640a.put(fileDownloadModel.m27561e(), fileDownloadModel);
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: k */
    public void mo28736k(int i2, Throwable th, long j2) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: l */
    public void mo28737l(int i2, long j2) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: m */
    public void mo28738m(int i2, long j2, String str, String str2) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: n */
    public List<C8699a> mo28739n(int i2) {
        List<C8699a> list;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34641b) {
            list = this.f34641b.get(i2);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: o */
    public FileDownloadModel mo28740o(int i2) {
        FileDownloadModel fileDownloadModel;
        synchronized (this.f34640a) {
            fileDownloadModel = this.f34640a.get(i2);
        }
        return fileDownloadModel;
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: p */
    public void mo28741p(int i2, int i3) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: q */
    public void mo28742q(int i2, long j2) {
    }

    /* renamed from: r */
    public void m28747r(FileDownloadModel fileDownloadModel) {
        synchronized (this.f34640a) {
            this.f34640a.put(fileDownloadModel.m27561e(), fileDownloadModel);
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    public boolean remove(int i2) {
        synchronized (this.f34640a) {
            this.f34640a.remove(i2);
        }
        return true;
    }
}
