/*package com.samsung.android.simplehealth;

import android.util.Log;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.healthdata.HealthData;
import com.samsung.android.sdk.healthdata.HealthDataObserver;
import com.samsung.android.sdk.healthdata.HealthDataResolver;
import com.samsung.android.sdk.healthdata.HealthDataResolver.ReadRequest;
import com.samsung.android.sdk.healthdata.HealthDataResolver.ReadResult;
import com.samsung.android.sdk.healthdata.HealthDataStore;
import com.samsung.android.sdk.healthdata.HealthResultHolder;

import android.util.Log;

import java.util.Calendar;
import java.util.TimeZone;
*/
/**
 * Created by rave on 29.08.2018.
 */
/*
public class HeartMonitor {
    private final HealthDataStore mStore;
    //private HeartMonitor mStepCountObserver;
    private HeartMonitor mHeartMonitorObserver;
    //private static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000L;

    public HeartMonitor(HealthDataStore store) {
        mStore = store;
    }

    public void start(HeartMonitor listener) {
        mHeartMonitorObserver = listener;
        // Register an observer to listen changes of step count and get today step count (HEART_RATE)
        HealthDataObserver.addObserver(mStore, HealthConstants.HeartRate.HEART_BEAT_COUNT, mObserver);
        readHeartBeat();
    }

    // Read the today's step count on demand
    private void readHeartBeat() {
        HealthDataResolver resolver = new HealthDataResolver(mStore, null);

        // Set time range from start time of today to the current time
        //long startTime = getStartTimeOfToday();
        //long endTime = startTime + ONE_DAY_IN_MILLIS;

        HealthDataResolver.ReadRequest request = new ReadRequest.Builder()
                .setDataType(HealthConstants.HeartRate.HEART_BEAT_COUNT)
                //.setProperties(new String[] {HealthConstants.HeartRate.HEART_RATE})
                //.setLocalTimeRange(HealthConstants.StepCount.START_TIME, HealthConstants.StepCount.TIME_OFFSET,
                //        startTime, endTime)
                .build();

        try {
            resolver.read(request).setResultListener(mListener);
        } catch (Exception e) {
            Log.e(MainActivity.APP_TAG, "Getting heart rate fails.", e);
        }
    }

    //private long getStartTimeOfToday() {
    //    return -1;
    //}

    private final HealthResultHolder.ResultListener<ReadResult> mListener = result -> {
        int count = 0;

        try {
            for (HealthData data : result) {
                count = data.getInt(HealthConstants.HeartRate.HEART_BEAT_COUNT);
            }
        } finally {
            result.close();
        }

        if (mHeartMonitorObserver != null) {
            mHeartMonitorObserver.onChanged(count);
        }
    };

    private final HealthDataObserver mObserver = new HealthDataObserver(null) {

        // Update the step count when a change event is received
        @Override
        public void onChange(String dataTypeName) {
            Log.d(MainActivity.APP_TAG, "Observer receives a data changed event");
            readHeartBeat();
        }
    };

    public interface StepCountObserver {
        void onChanged(int count);
    }
}
*/