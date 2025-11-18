package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.C8694b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p241e.p307h.p308a.p315k0.C9032b;

/* compiled from: MessageSnapshotThreadPool.java */
/* renamed from: com.liulishuo.filedownloader.message.d */
/* loaded from: classes2.dex */
public class C8696d {

    /* renamed from: a */
    private final List<a> f33007a = new ArrayList();

    /* renamed from: b */
    private final C8694b.b f33008b;

    /* compiled from: MessageSnapshotThreadPool.java */
    /* renamed from: com.liulishuo.filedownloader.message.d$a */
    public class a {

        /* renamed from: a */
        private final List<Integer> f33009a = new ArrayList();

        /* renamed from: b */
        private final Executor f33010b;

        /* compiled from: MessageSnapshotThreadPool.java */
        /* renamed from: com.liulishuo.filedownloader.message.d$a$a, reason: collision with other inner class name */
        class RunnableC11520a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ MessageSnapshot f33012f;

            RunnableC11520a(MessageSnapshot messageSnapshot) {
                this.f33012f = messageSnapshot;
            }

            @Override // java.lang.Runnable
            public void run() {
                C8696d.this.f33008b.mo27539H(this.f33012f);
                a.this.f33009a.remove(Integer.valueOf(this.f33012f.m27531e()));
            }
        }

        public a(int i2) {
            this.f33010b = C9032b.m28953a(1, "Flow-" + i2);
        }

        /* renamed from: b */
        public void m27549b(int i2) {
            this.f33009a.add(Integer.valueOf(i2));
        }

        /* renamed from: c */
        public void m27550c(MessageSnapshot messageSnapshot) {
            this.f33010b.execute(new RunnableC11520a(messageSnapshot));
        }
    }

    C8696d(int i2, C8694b.b bVar) {
        this.f33008b = bVar;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f33007a.add(new a(i3));
        }
    }

    /* renamed from: b */
    public void m27547b(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.f33007a) {
                int iM27531e = messageSnapshot.m27531e();
                Iterator<a> it = this.f33007a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (next.f33009a.contains(Integer.valueOf(iM27531e))) {
                        aVar = next;
                        break;
                    }
                }
                if (aVar == null) {
                    int size = 0;
                    Iterator<a> it2 = this.f33007a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a next2 = it2.next();
                        if (next2.f33009a.size() <= 0) {
                            aVar = next2;
                            break;
                        } else if (size == 0 || next2.f33009a.size() < size) {
                            size = next2.f33009a.size();
                            aVar = next2;
                        }
                    }
                }
                aVar.m27549b(iM27531e);
            }
        } finally {
            aVar.m27550c(messageSnapshot);
        }
    }
}
