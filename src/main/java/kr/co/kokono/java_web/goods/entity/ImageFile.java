package kr.co.kokono.java_web.goods.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ImageFile {

    private Long goodsId;
    private Long imageId;
    private String fileName;
    private String fileType;
    private String regId;
}
