package com.wuzhizhan.mybatis.alias;

import com.google.common.collect.Sets;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Set;

/**
 * @author yanglin
 */
public class BeanAliasResolver extends PackageAliasResolver {

    private static final String MAPPER_ALIAS_PACKAGE_CLASS = "org.mybatis.spring.SqlSessionFactoryBean";
    private static final String MAPPER_ALIAS_PROPERTY = "typeAliasesPackage";
    private ModuleManager moduleManager;

    public BeanAliasResolver(Project project) {
        super(project);
        this.moduleManager = ModuleManager.getInstance(project);
    }

    @NotNull
    @Override
    public Collection<String> getPackages(@Nullable PsiElement element) {
        Set<String> res = Sets.newHashSet();
//        for (Module module : moduleManager.getModules()) {
//            for (CommonSpringModel springModel : springManager.getCombinedModel(module).getRelatedModels()) {
//                addPackages(res, springModel);
//            }
//        }
        return res;
    }


}
