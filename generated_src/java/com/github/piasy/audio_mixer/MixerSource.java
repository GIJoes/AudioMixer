// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from audio_mixer.djinni

package com.github.piasy.audio_mixer;

public final class MixerSource {

    public static final int TYPE_FILE = 1;

    public static final int TYPE_RECORD = 2;


    /*package*/ final int mType;

    /*package*/ final int mSsrc;

    /*package*/ final float mVolume;

    /*package*/ final String mPath;

    /*package*/ final int mSampleRate;

    /*package*/ final int mChannelNum;

    public MixerSource(
            int type,
            int ssrc,
            float volume,
            String path,
            int sampleRate,
            int channelNum) {
        this.mType = type;
        this.mSsrc = ssrc;
        this.mVolume = volume;
        this.mPath = path;
        this.mSampleRate = sampleRate;
        this.mChannelNum = channelNum;
    }

    public int getType() {
        return mType;
    }

    public int getSsrc() {
        return mSsrc;
    }

    public float getVolume() {
        return mVolume;
    }

    public String getPath() {
        return mPath;
    }

    public int getSampleRate() {
        return mSampleRate;
    }

    public int getChannelNum() {
        return mChannelNum;
    }

    @Override
    public String toString() {
        return "MixerSource{" +
                "mType=" + mType +
                "," + "mSsrc=" + mSsrc +
                "," + "mVolume=" + mVolume +
                "," + "mPath=" + mPath +
                "," + "mSampleRate=" + mSampleRate +
                "," + "mChannelNum=" + mChannelNum +
        "}";
    }

}
