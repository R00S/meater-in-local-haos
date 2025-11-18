package cm.aptoide.p092pt.dataprovider.util.referrer;

/* loaded from: classes.dex */
public class SimpleTimedFuture<T> {
    private int DELAY;
    private T value;

    public T get() {
        return get(5000);
    }

    public boolean isDone() {
        return this.value != null;
    }

    public void set(T t) {
        this.value = t;
    }

    public T get(int i2) throws InterruptedException {
        int i3 = 0;
        while (!isDone()) {
            try {
                this.DELAY = 100;
                Thread.sleep(100);
                i3++;
                if (this.DELAY * i3 > i2) {
                    throw new InterruptedException("TimeOut reached! " + i2);
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return this.value;
    }
}
