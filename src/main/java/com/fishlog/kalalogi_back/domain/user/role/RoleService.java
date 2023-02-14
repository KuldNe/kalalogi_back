package com.fishlog.kalalogi_back.domain.user.role;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;


    public Role getByRoleId(int i) {
        return roleRepository.findById(2).get();
    }
}
