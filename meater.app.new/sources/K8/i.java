package K8;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: ComponentRegistrarProcessor.java */
/* loaded from: classes2.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f8761a = new i() { // from class: K8.h
        @Override // K8.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<c<?>> a(ComponentRegistrar componentRegistrar);
}
