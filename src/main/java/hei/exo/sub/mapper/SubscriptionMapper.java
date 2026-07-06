package hei.exo.sub.mapper;

import hei.exo.sub.dto.SubscriptionRequest;
import hei.exo.sub.entity.SubscriptionEntity;
import hei.exo.sub.models.Subscription;

import java.util.UUID;

public class SubscriptionMapper {
    public SubscriptionEntity toEntity(UUID id, SubscriptionRequest request) {
        var entity = new  SubscriptionEntity();
        entity.setId(id);
        entity.setUserId(request.id());
        entity.setCourseId(request.courseId());
        return entity;
    }

    public Subscription toModel(SubscriptionEntity subscriptionEntity) {
        return new Subscription(
                subscriptionEntity.getId(),
                subscriptionEntity.getUserId(),
                subscriptionEntity.getCourseId());
    }
}
