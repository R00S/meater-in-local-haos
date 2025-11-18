package cm.aptoide.p092pt.install.remote;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import p345i.p346a.AbstractC9182a;
import p345i.p346a.AbstractC9184c;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.InterfaceC9186e;

/* loaded from: classes.dex */
public class RemoteInstallationSenderManager {
    static final int DISCOVERY_TO = 20000;
    static final String INVALID_PAYLOAD_RESPONSE = "INVALIDPAYLOAD";
    static final String PAYLOAD_TAG = "apkinstall_appid=";
    static final String SERVER_TAG_TO_REMOVE = ".local.";
    static final String SERVICE_TYPE = "_aptoide-rmtinst._tcp.local.";
    static final String SUCCESS_TAG = "receivedpayload=";
    static final String TAG = "RemoteInstallationSenderManager";
    static final int TIMEOUT = 10000;
    SocketClientThread clientServerThread;
    Context context;
    Handler handler = new Handler();
    AbstractC9182a jmDNS;
    RemoteInstallationSenderListener listener;
    WifiManager.MulticastLock multicastLock;

    /* renamed from: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager$1 */
    class RunnableC35601 implements Runnable {
        RunnableC35601() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WifiManager wifiManager = (WifiManager) RemoteInstallationSenderManager.this.context.getSystemService("wifi");
                RemoteInstallationSenderManager remoteInstallationSenderManager = RemoteInstallationSenderManager.this;
                remoteInstallationSenderManager.multicastLock = wifiManager.createMulticastLock(remoteInstallationSenderManager.context.getClass().getName());
                RemoteInstallationSenderManager.this.multicastLock.setReferenceCounted(true);
                RemoteInstallationSenderManager.this.multicastLock.acquire();
                RemoteInstallationSenderManager remoteInstallationSenderManager2 = RemoteInstallationSenderManager.this;
                remoteInstallationSenderManager2.jmDNS = AbstractC9182a.m29402A(remoteInstallationSenderManager2.getAddress(), Build.MODEL);
                RemoteInstallationSenderManager.this.jmDNS.mo29404z(RemoteInstallationSenderManager.SERVICE_TYPE, new InterfaceC9186e() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.1
                    @Override // p345i.p346a.InterfaceC9186e
                    public void serviceAdded(AbstractC9184c abstractC9184c) {
                        Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - A service has been added: " + abstractC9184c.mo29412e());
                    }

                    @Override // p345i.p346a.InterfaceC9186e
                    public void serviceRemoved(AbstractC9184c abstractC9184c) {
                        AbstractC9185d abstractC9185dMo29412e = abstractC9184c.mo29412e();
                        final Inet4Address inet4Address = abstractC9185dMo29412e.mo29418h()[0];
                        final int iMo29422l = abstractC9185dMo29412e.mo29422l();
                        final String strMo29426p = abstractC9185dMo29412e.mo29426p();
                        if (strMo29426p.contains(RemoteInstallationSenderManager.SERVER_TAG_TO_REMOVE)) {
                            strMo29426p = strMo29426p.substring(0, strMo29426p.length() - 7);
                        }
                        Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - A service has been removed: " + abstractC9184c.mo29412e());
                        RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                RemoteInstallationSenderManager.this.listener.onAptoideTVServiceLost(new ReceiverDevice(strMo29426p, inet4Address, iMo29422l));
                            }
                        });
                    }

                    @Override // p345i.p346a.InterfaceC9186e
                    public void serviceResolved(AbstractC9184c abstractC9184c) {
                        AbstractC9185d abstractC9185dMo29412e = abstractC9184c.mo29412e();
                        final Inet4Address inet4Address = abstractC9185dMo29412e.mo29418h()[0];
                        final int iMo29422l = abstractC9185dMo29412e.mo29422l();
                        final String strMo29426p = abstractC9185dMo29412e.mo29426p();
                        if (strMo29426p.contains(RemoteInstallationSenderManager.SERVER_TAG_TO_REMOVE)) {
                            strMo29426p = strMo29426p.substring(0, strMo29426p.length() - 7);
                        }
                        Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - A service has been resolved: " + abstractC9184c.mo29412e());
                        RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                RemoteInstallationSenderManager.this.listener.onAptoideTVServiceFound(new ReceiverDevice(strMo29426p, inet4Address, iMo29422l));
                            }
                        });
                    }
                });
                RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        RemoteInstallationSenderManager.this.listener.onDiscoveryStarted();
                    }
                });
            } catch (IOException e2) {
                RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        RemoteInstallationSenderManager.this.listener.onNoNetworkAccess();
                    }
                });
                Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - Error on discover: " + e2);
            }
        }
    }

    private class SocketClientThread extends AsyncTask<Void, Void, Boolean> {
        private String app;
        private ReceiverDevice device;

        public SocketClientThread(ReceiverDevice receiverDevice, String str) {
            this.device = receiverDevice;
            this.app = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01da  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Boolean doInBackground(java.lang.Void... r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 505
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.SocketClientThread.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                RemoteInstallationSenderManager.this.listener.onAppSendSuccess();
            } else {
                RemoteInstallationSenderManager.this.listener.onAppSendUnsuccess();
            }
            super.onPostExecute((SocketClientThread) bool);
        }
    }

    public RemoteInstallationSenderManager(Context context) {
        this.context = context;
    }

    public void discoverAptoideTVServices(RemoteInstallationSenderListener remoteInstallationSenderListener) {
        this.listener = remoteInstallationSenderListener;
        new Thread(new RunnableC35601()).start();
        runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.2
            @Override // java.lang.Runnable
            public void run() {
                RemoteInstallationSenderManager.this.stopDiscoveringAptoideTVServices();
            }
        }, 20000L);
    }

    InetAddress getAddress() throws UnknownHostException {
        int ipAddress = ((WifiManager) this.context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return InetAddress.getByAddress(new byte[]{(byte) (ipAddress & 255), (byte) ((ipAddress >> 8) & 255), (byte) ((ipAddress >> 16) & 255), (byte) ((ipAddress >> 24) & 255)});
    }

    void runOnUiThread(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void sendAppId(ReceiverDevice receiverDevice, String str) {
        SocketClientThread socketClientThread = new SocketClientThread(receiverDevice, str);
        this.clientServerThread = socketClientThread;
        socketClientThread.execute(new Void[0]);
    }

    public void stopDiscoveringAptoideTVServices() {
        new AsyncTask<Void, Void, Void>() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.3
            private boolean closed = false;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) throws IOException {
                try {
                    AbstractC9182a abstractC9182a = RemoteInstallationSenderManager.this.jmDNS;
                    if (abstractC9182a != null) {
                        abstractC9182a.mo29403B();
                        RemoteInstallationSenderManager.this.jmDNS.close();
                        this.closed = true;
                        RemoteInstallationSenderManager.this.jmDNS = null;
                    }
                    WifiManager.MulticastLock multicastLock = RemoteInstallationSenderManager.this.multicastLock;
                    if (multicastLock != null) {
                        multicastLock.release();
                        RemoteInstallationSenderManager.this.multicastLock = null;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void r2) {
                if (this.closed) {
                    RemoteInstallationSenderManager.this.listener.onDiscoveryStopped();
                }
                super.onPostExecute((AsyncTaskC35623) r2);
            }
        }.execute(null);
    }

    void runOnUiThread(Runnable runnable, long j2) {
        this.handler.postDelayed(runnable, j2);
    }
}
