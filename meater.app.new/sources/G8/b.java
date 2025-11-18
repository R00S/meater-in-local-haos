package G8;

import I8.a;
import android.content.Context;
import com.google.firebase.abt.AbtException;
import j9.InterfaceC3755b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3755b<I8.a> f4990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4991b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f4992c = null;

    public b(Context context, InterfaceC3755b<I8.a> interfaceC3755b, String str) {
        this.f4990a = interfaceC3755b;
        this.f4991b = str;
    }

    private void a(a.c cVar) {
        this.f4990a.get().b(cVar);
    }

    private void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        for (a aVar : list) {
            while (arrayDeque.size() >= i10) {
                k(((a.c) arrayDeque.pollFirst()).f6736b);
            }
            a.c cVarF = aVar.f(this.f4991b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    private static List<a> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.b(it.next()));
        }
        return arrayList;
    }

    private boolean d(List<a> list, a aVar) {
        String strC = aVar.c();
        String strE = aVar.e();
        for (a aVar2 : list) {
            if (aVar2.c().equals(strC) && aVar2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    private List<a.c> f() {
        return this.f4990a.get().e(this.f4991b, "");
    }

    private ArrayList<a> g(List<a> list, List<a> list2) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<a> list, List<a> list2) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar.f(this.f4991b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f4992c == null) {
            this.f4992c = Integer.valueOf(this.f4990a.get().d(this.f4991b));
        }
        return this.f4992c.intValue();
    }

    private void k(String str) {
        this.f4990a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f6736b);
        }
    }

    private void n(List<a> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<a> listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    private void o() throws AbtException {
        if (this.f4990a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List<a> e() throws AbtException {
        o();
        List<a.c> listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        return arrayList;
    }

    public void j() throws AbtException {
        o();
        l(f());
    }

    public void m(List<Map<String, String>> list) throws AbtException {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }
}
