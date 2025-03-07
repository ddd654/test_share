package com.project.tobe.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderB is a Querydsl query type for OrderB
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderB extends EntityPathBase<OrderB> {

    private static final long serialVersionUID = 1602434769L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderB orderB = new QOrderB("orderB");

    public final QOrderB_OrderBId orderBId;

    public final QOrderH orderH;

    public final NumberPath<Integer> orderProductQty = createNumber("orderProductQty", Integer.class);

    public final QProduct product;

    public QOrderB(String variable) {
        this(OrderB.class, forVariable(variable), INITS);
    }

    public QOrderB(Path<? extends OrderB> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderB(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderB(PathMetadata metadata, PathInits inits) {
        this(OrderB.class, metadata, inits);
    }

    public QOrderB(Class<? extends OrderB> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderBId = inits.isInitialized("orderBId") ? new QOrderB_OrderBId(forProperty("orderBId")) : null;
        this.orderH = inits.isInitialized("orderH") ? new QOrderH(forProperty("orderH"), inits.get("orderH")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
    }

}

