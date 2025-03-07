package com.project.tobe.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderH is a Querydsl query type for OrderH
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderH extends EntityPathBase<OrderH> {

    private static final long serialVersionUID = 1602434775L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderH orderH = new QOrderH("orderH");

    public final DatePath<java.time.LocalDate> confirmChangeDate = createDate("confirmChangeDate", java.time.LocalDate.class);

    public final EnumPath<OrderH.ConfirmStatus> confirmStatus = createEnum("confirmStatus", OrderH.ConfirmStatus.class);

    public final QCustomer customer;

    public final DatePath<java.time.LocalDate> delDate = createDate("delDate", java.time.LocalDate.class);

    public final QEmployee employee;

    public final ListPath<OrderB, QOrderB> orderBList = this.<OrderB, QOrderB>createList("orderBList", OrderB.class, QOrderB.class, PathInits.DIRECT2);

    public final NumberPath<Long> orderNo = createNumber("orderNo", Long.class);

    public final DatePath<java.time.LocalDate> regDate = createDate("regDate", java.time.LocalDate.class);

    public final StringPath remarks = createString("remarks");

    public QOrderH(String variable) {
        this(OrderH.class, forVariable(variable), INITS);
    }

    public QOrderH(Path<? extends OrderH> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderH(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderH(PathMetadata metadata, PathInits inits) {
        this(OrderH.class, metadata, inits);
    }

    public QOrderH(Class<? extends OrderH> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

