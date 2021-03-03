package com.wuzhizhan.mybatis.service;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * 日期 2018-11-30
 *
 * @author 吴志展
 */
public class TableInfoService {
    public static TableInfoService getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, TableInfoService.class);
    }
}
