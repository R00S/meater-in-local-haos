package Tb;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function2;", "LTb/j;", "Lta/d;", "Loa/F;", "", "block", "LTb/h;", "b", "(LBa/p;)LTb/h;", "", "a", "(LBa/p;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Tb/l$a", "LTb/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ba.p f16692a;

        public a(Ba.p pVar) {
            this.f16692a = pVar;
        }

        @Override // Tb.h
        public Iterator<T> iterator() {
            return k.a(this.f16692a);
        }
    }

    public static <T> Iterator<T> a(Ba.p<? super j<? super T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> block) {
        C3862t.g(block, "block");
        i iVar = new i();
        iVar.j(C4696b.a(block, iVar, iVar));
        return iVar;
    }

    public static <T> h<T> b(Ba.p<? super j<? super T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> block) {
        C3862t.g(block, "block");
        return new a(block);
    }
}
