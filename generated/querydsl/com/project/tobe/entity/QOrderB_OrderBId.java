package com.project.tobe.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderB_OrderBId is a Querydsl query type for OrderBId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QOrderB_OrderBId extends BeanPath<OrderB.OrderBId> {

    private static final long serialVersionUID = 1130809740L;

    public static final QOrderB_OrderBId orderBId = new QOrderB_OrderBId("orderBId");

    public final NumberPath<Long> orderNo = createNumber("orderNo", Long.class);

    public final NumberPath<Long> productNo = createNumber("productNo", Long.class);

    public QOrderB_OrderBId(String variable) {
        super(OrderB.OrderBId.class, forVariable(variable));
    }

    public QOrderB_OrderBId(Path<? extends OrderB.OrderBId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderB_OrderBId(PathMetadata metadata) {
        super(OrderB.OrderBId.class, metadata);
    }

}

