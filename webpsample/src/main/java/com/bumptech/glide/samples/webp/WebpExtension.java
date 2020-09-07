package com.bumptech.glide.samples.webp;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.integration.framesequence.ByteBufferFsDecoder;
import com.bumptech.glide.integration.framesequence.StreamFsDecoder;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by dezng on 2020/9/7.
 */
@GlideExtension
public class WebpExtension {
    private WebpExtension() {
    }

    @GlideOption
    public static BaseRequestOptions<?> webpDontAnim(BaseRequestOptions<?> options){
        return options
            .set(StreamFsDecoder.DISABLE_ANIMATION, true)
            .set(ByteBufferFsDecoder.DISABLE_ANIMATION, true);
    }
}
