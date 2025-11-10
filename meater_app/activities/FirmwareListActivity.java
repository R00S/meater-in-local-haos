package com.apptionlabs.meater_app.activities;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.apptionlabs.meater_app.activities.FirmwareListActivity;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.versions.FirmwareInfo;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class FirmwareListActivity extends OrientationActivity {
    MEATERDeviceType S;
    List<FirmwareInfo> T;
    long U;

    private void M0(String str, String str2, String str3) {
        Intent intent;
        finish();
        MEATERDeviceType mEATERDeviceType = this.S;
        if (mEATERDeviceType != MEATERDeviceType.BLOCK && mEATERDeviceType != MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
            intent = new Intent(getApplicationContext(), (Class<?>) MEATERPlusFirmwareUpdateActivity.class);
        } else {
            intent = new Intent(getApplicationContext(), (Class<?>) BlockFirmwareUpdateActivity.class);
        }
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, this.U);
        intent.putExtra(FirmwareInfo.Key.URL.name(), str);
        intent.putExtra(FirmwareInfo.Key.CRC.name(), str2);
        intent.putExtra(FirmwareInfo.Key.VERSION.name(), str3);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(AdapterView adapterView, View view, int i10, long j10) {
        FirmwareInfo firmwareInfo = this.T.get(i10);
        M0(firmwareInfo.url, firmwareInfo.crc, firmwareInfo.version);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558441);
        ListView listView = (ListView) findViewById(2131362777);
        TextView textView = (TextView) findViewById(2131363581);
        int i10 = 0;
        this.S = MEATERDeviceType.values()[getIntent().getIntExtra("mDeviceType", 0)];
        this.T = FirmwareVersion.sharedInstance().getAllDevFirmwareVersionsAvailable(this.S);
        this.U = getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
        if (this.T.size() > 0 && this.U != 0) {
            String[] strArr = new String[this.T.size()];
            Iterator<FirmwareInfo> it = this.T.iterator();
            while (it.hasNext()) {
                String b10 = f8.j.b(it.next().url);
                if (b10 != null) {
                    strArr[i10] = b10;
                } else {
                    Log.info("FirmwareListActivity", "File name could not parse");
                }
                i10++;
            }
            listView.setAdapter((ListAdapter) new ArrayAdapter(this, R.layout.simple_list_item_1, strArr));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: p5.n1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i11, long j10) {
                    FirmwareListActivity.this.N0(adapterView, view, i11, j10);
                }
            });
            return;
        }
        textView.setText(2132018528);
    }
}
