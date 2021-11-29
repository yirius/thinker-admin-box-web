package com.thinker.adminweb.langs;

import cn.hutool.core.lang.Dict;
import com.thinker.framework.framework.langs.ILangInfo;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThinkerLangInfo extends ILangInfo {

    @Override
    public Dict getZhCn() {
        return Dict.create().set("system", Dict.create()
                        .set("title", "您的后台名称")
                        .set("subTitle", "子标题"));
    }

    @Override
    public Dict getEn() {
        return Dict.create().set("system", Dict.create()
                        .set("title", "Your Admin Title")
                        .set("subTitle", "Subtitle"));
    }

}
