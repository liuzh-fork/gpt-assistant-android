package io.baidu.aip.asrwakeup3.core.wakeup.listener;

import android.os.Handler;
import io.baidu.aip.asrwakeup3.core.recog.IStatus;
import io.baidu.aip.asrwakeup3.core.wakeup.WakeUpResult;

/**
 * Created by fujiayi on 2017/9/21.
 */

public class RecogWakeupListener extends SimpleWakeupListener implements IStatus {

    private static final String TAG = "RecogWakeupListener";

    private Handler handler;

    public RecogWakeupListener(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void onSuccess(String word, WakeUpResult result) {
        super.onSuccess(word, result);
        handler.sendMessage(handler.obtainMessage(STATUS_WAKEUP_SUCCESS));
    }
}
