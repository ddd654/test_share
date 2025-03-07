package com.project.tobe.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = 1713422523L;

    public static final QCustomer customer = new QCustomer("customer");

    public final StringPath activated = createString("activated");

    public final StringPath businessRegistrationNo = createString("businessRegistrationNo");

    public final StringPath customerAddr = createString("customerAddr");

    public final StringPath customerName = createString("customerName");

    public final NumberPath<Long> customerNo = createNumber("customerNo", Long.class);

    public final StringPath customerTel = createString("customerTel");

    public final StringPath nation = createString("nation");

    public final StringPath picEmail = createString("picEmail");

    public final StringPath picName = createString("picName");

    public final StringPath picTel = createString("picTel");

    public final NumberPath<Integer> postNum = createNumber("postNum", Integer.class);

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata metadata) {
        super(Customer.class, metadata);
    }

}

