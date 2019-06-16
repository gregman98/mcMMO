package com.gmail.nossr50.config.hocon.serializers;

import com.gmail.nossr50.config.hocon.skills.repair.RepairWildcard;
import com.google.common.reflect.TypeToken;
import ninja.leaping.configurate.ConfigurationNode;
import ninja.leaping.configurate.objectmapping.ObjectMappingException;
import ninja.leaping.configurate.objectmapping.serialize.TypeSerializer;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepairWildcardSerializer implements TypeSerializer<RepairWildcard> {
    @Nullable
    @Override
    public RepairWildcard deserialize(@NonNull TypeToken<?> type, @NonNull ConfigurationNode value) throws ObjectMappingException {
        return null;
    }

    @Override
    public void serialize(@NonNull TypeToken<?> type, @Nullable RepairWildcard obj, @NonNull ConfigurationNode value) throws ObjectMappingException {

    }
}