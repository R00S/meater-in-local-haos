package com.airbnb.epoxy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: ModelList.java */
/* renamed from: com.airbnb.epoxy.c0 */
/* loaded from: classes.dex */
class C5132c0 extends ArrayList<AbstractC5166s<?>> {

    /* renamed from: f */
    private boolean f12210f;

    /* renamed from: g */
    private d f12211g;

    /* compiled from: ModelList.java */
    /* renamed from: com.airbnb.epoxy.c0$b */
    private class b implements Iterator<AbstractC5166s<?>> {

        /* renamed from: f */
        int f12212f;

        /* renamed from: g */
        int f12213g;

        /* renamed from: h */
        int f12214h;

        private b() {
            this.f12213g = -1;
            this.f12214h = ((ArrayList) C5132c0.this).modCount;
        }

        /* renamed from: b */
        final void m9246b() {
            if (((ArrayList) C5132c0.this).modCount != this.f12214h) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC5166s<?> next() {
            m9246b();
            int i2 = this.f12212f;
            this.f12212f = i2 + 1;
            this.f12213g = i2;
            return C5132c0.this.get(i2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12212f != C5132c0.this.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12213g < 0) {
                throw new IllegalStateException();
            }
            m9246b();
            try {
                C5132c0.this.remove(this.f12213g);
                this.f12212f = this.f12213g;
                this.f12213g = -1;
                this.f12214h = ((ArrayList) C5132c0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* compiled from: ModelList.java */
    /* renamed from: com.airbnb.epoxy.c0$c */
    private class c extends b implements ListIterator<AbstractC5166s<?>> {
        c(int i2) {
            super();
            this.f12212f = i2;
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void add(AbstractC5166s<?> abstractC5166s) {
            m9246b();
            try {
                int i2 = this.f12212f;
                C5132c0.this.add(i2, abstractC5166s);
                this.f12212f = i2 + 1;
                this.f12213g = -1;
                this.f12214h = ((ArrayList) C5132c0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC5166s<?> previous() {
            m9246b();
            int i2 = this.f12212f - 1;
            if (i2 < 0) {
                throw new NoSuchElementException();
            }
            this.f12212f = i2;
            this.f12213g = i2;
            return C5132c0.this.get(i2);
        }

        @Override // java.util.ListIterator
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void set(AbstractC5166s<?> abstractC5166s) {
            if (this.f12213g < 0) {
                throw new IllegalStateException();
            }
            m9246b();
            try {
                C5132c0.this.set(this.f12213g, abstractC5166s);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f12212f != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f12212f;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f12212f - 1;
        }
    }

    /* compiled from: ModelList.java */
    /* renamed from: com.airbnb.epoxy.c0$d */
    interface d {
        /* renamed from: a */
        void mo9251a(int i2, int i3);

        /* renamed from: b */
        void mo9252b(int i2, int i3);
    }

    C5132c0(int i2) {
        super(i2);
    }

    /* renamed from: P */
    private void m9224P(int i2, int i3) {
        d dVar;
        if (this.f12210f || (dVar = this.f12211g) == null) {
            return;
        }
        dVar.mo9251a(i2, i3);
    }

    /* renamed from: R */
    private void m9225R(int i2, int i3) {
        d dVar;
        if (this.f12210f || (dVar = this.f12211g) == null) {
            return;
        }
        dVar.mo9252b(i2, i3);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void add(int i2, AbstractC5166s<?> abstractC5166s) {
        m9224P(i2, 1);
        super.add(i2, abstractC5166s);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public boolean add(AbstractC5166s<?> abstractC5166s) {
        m9224P(size(), 1);
        return super.add(abstractC5166s);
    }

    /* renamed from: S */
    void m9241S() {
        if (this.f12210f) {
            throw new IllegalStateException("Notifications already paused");
        }
        this.f12210f = true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public AbstractC5166s<?> remove(int i2) {
        m9225R(i2, 1);
        return (AbstractC5166s) super.remove(i2);
    }

    /* renamed from: V */
    void m9243V() {
        if (!this.f12210f) {
            throw new IllegalStateException("Notifications already resumed");
        }
        this.f12210f = false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public AbstractC5166s<?> set(int i2, AbstractC5166s<?> abstractC5166s) {
        AbstractC5166s<?> abstractC5166s2 = (AbstractC5166s) super.set(i2, abstractC5166s);
        if (abstractC5166s2.m9359id() != abstractC5166s.m9359id()) {
            m9225R(i2, 1);
            m9224P(i2, 1);
        }
        return abstractC5166s2;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends AbstractC5166s<?>> collection) {
        m9224P(size(), collection.size());
        return super.addAll(collection);
    }

    /* renamed from: b0 */
    void m9245b0(d dVar) {
        this.f12211g = dVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isEmpty()) {
            return;
        }
        m9225R(0, size());
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<AbstractC5166s<?>> iterator() {
        return new b();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<AbstractC5166s<?>> listIterator() {
        return new c(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<AbstractC5166s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        m9225R(i2, i3 - i2);
        super.removeRange(i2, i3);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<AbstractC5166s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public List<AbstractC5166s<?>> subList(int i2, int i3) {
        if (i2 < 0 || i3 > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 <= i3) {
            return new e(this, i2, i3);
        }
        throw new IllegalArgumentException();
    }

    C5132c0() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<AbstractC5166s<?>> listIterator(int i2) {
        return new c(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        m9225R(iIndexOf, 1);
        super.remove(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends AbstractC5166s<?>> collection) {
        m9224P(i2, collection.size());
        return super.addAll(i2, collection);
    }

    /* compiled from: ModelList.java */
    /* renamed from: com.airbnb.epoxy.c0$e */
    private static class e extends AbstractList<AbstractC5166s<?>> {

        /* renamed from: f */
        private final C5132c0 f12217f;

        /* renamed from: g */
        private int f12218g;

        /* renamed from: h */
        private int f12219h;

        /* compiled from: ModelList.java */
        /* renamed from: com.airbnb.epoxy.c0$e$a */
        private static final class a implements ListIterator<AbstractC5166s<?>> {

            /* renamed from: f */
            private final e f12220f;

            /* renamed from: g */
            private final ListIterator<AbstractC5166s<?>> f12221g;

            /* renamed from: h */
            private int f12222h;

            /* renamed from: i */
            private int f12223i;

            a(ListIterator<AbstractC5166s<?>> listIterator, e eVar, int i2, int i3) {
                this.f12221g = listIterator;
                this.f12220f = eVar;
                this.f12222h = i2;
                this.f12223i = i2 + i3;
            }

            @Override // java.util.ListIterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void add(AbstractC5166s<?> abstractC5166s) {
                this.f12221g.add(abstractC5166s);
                this.f12220f.m9257i(true);
                this.f12223i++;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public AbstractC5166s<?> next() {
                if (this.f12221g.nextIndex() < this.f12223i) {
                    return this.f12221g.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public AbstractC5166s<?> previous() {
                if (this.f12221g.previousIndex() >= this.f12222h) {
                    return this.f12221g.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void set(AbstractC5166s<?> abstractC5166s) {
                this.f12221g.set(abstractC5166s);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f12221g.nextIndex() < this.f12223i;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f12221g.previousIndex() >= this.f12222h;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f12221g.nextIndex() - this.f12222h;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                int iPreviousIndex = this.f12221g.previousIndex();
                int i2 = this.f12222h;
                if (iPreviousIndex >= i2) {
                    return iPreviousIndex - i2;
                }
                return -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                this.f12221g.remove();
                this.f12220f.m9257i(false);
                this.f12223i--;
            }
        }

        e(C5132c0 c5132c0, int i2, int i3) {
            this.f12217f = c5132c0;
            ((AbstractList) this).modCount = ((ArrayList) c5132c0).modCount;
            this.f12218g = i2;
            this.f12219h = i3 - i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i2, Collection<? extends AbstractC5166s<?>> collection) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f12217f).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 > this.f12219h) {
                throw new IndexOutOfBoundsException();
            }
            boolean zAddAll = this.f12217f.addAll(i2 + this.f12218g, collection);
            if (zAddAll) {
                this.f12219h += collection.size();
                ((AbstractList) this).modCount = ((ArrayList) this.f12217f).modCount;
            }
            return zAddAll;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void add(int i2, AbstractC5166s<?> abstractC5166s) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f12217f).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 > this.f12219h) {
                throw new IndexOutOfBoundsException();
            }
            this.f12217f.add(i2 + this.f12218g, abstractC5166s);
            this.f12219h++;
            ((AbstractList) this).modCount = ((ArrayList) this.f12217f).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC5166s<?> get(int i2) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f12217f).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 >= this.f12219h) {
                throw new IndexOutOfBoundsException();
            }
            return this.f12217f.get(i2 + this.f12218g);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC5166s<?> remove(int i2) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f12217f).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 >= this.f12219h) {
                throw new IndexOutOfBoundsException();
            }
            AbstractC5166s<?> abstractC5166sRemove = this.f12217f.remove(i2 + this.f12218g);
            this.f12219h--;
            ((AbstractList) this).modCount = ((ArrayList) this.f12217f).modCount;
            return abstractC5166sRemove;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC5166s<?> set(int i2, AbstractC5166s<?> abstractC5166s) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f12217f).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 >= this.f12219h) {
                throw new IndexOutOfBoundsException();
            }
            return this.f12217f.set(i2 + this.f12218g, abstractC5166s);
        }

        /* renamed from: i */
        void m9257i(boolean z) {
            if (z) {
                this.f12219h++;
            } else {
                this.f12219h--;
            }
            ((AbstractList) this).modCount = ((ArrayList) this.f12217f).modCount;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<AbstractC5166s<?>> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<AbstractC5166s<?>> listIterator(int i2) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f12217f).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 > this.f12219h) {
                throw new IndexOutOfBoundsException();
            }
            return new a(this.f12217f.listIterator(i2 + this.f12218g), this, this.f12218g, this.f12219h);
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i2, int i3) {
            if (i2 != i3) {
                if (((AbstractList) this).modCount != ((ArrayList) this.f12217f).modCount) {
                    throw new ConcurrentModificationException();
                }
                C5132c0 c5132c0 = this.f12217f;
                int i4 = this.f12218g;
                c5132c0.removeRange(i2 + i4, i4 + i3);
                this.f12219h -= i3 - i2;
                ((AbstractList) this).modCount = ((ArrayList) this.f12217f).modCount;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            if (((AbstractList) this).modCount == ((ArrayList) this.f12217f).modCount) {
                return this.f12219h;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends AbstractC5166s<?>> collection) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f12217f).modCount) {
                boolean zAddAll = this.f12217f.addAll(this.f12218g + this.f12219h, collection);
                if (zAddAll) {
                    this.f12219h += collection.size();
                    ((AbstractList) this).modCount = ((ArrayList) this.f12217f).modCount;
                }
                return zAddAll;
            }
            throw new ConcurrentModificationException();
        }
    }
}
