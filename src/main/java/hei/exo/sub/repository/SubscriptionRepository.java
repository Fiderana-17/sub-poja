package hei.exo.sub.repository;

import hei.exo.sub.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubscriptionRepository extends JpaRepository<Subscription, UUID> {}
