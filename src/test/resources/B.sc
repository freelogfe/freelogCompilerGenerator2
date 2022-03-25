// 昨夜西风凋碧树
// 一条大河波浪宽
add $u2/r10.0@1.1.1 as p3
  do
    // 千金之子，坐不垂堂
    set_labels t1 | t2 | t3
    replace $uu9/rr9@1.1.1 with #bb0/mm0 under $u6/m6>$u7/m7 | $u8/m8
    // 添加依赖
    add_rely $uu9/rr9@1.1.1
    // 添加依赖到某个依赖下
    add_rely $uu9/rr9@1.1.1 | $uu9/rr9@1.1.1 to #bb0/mm0>#bb0/mm0
    // 移除依赖
    delete_rely $uu9/rr9@1.1.1
    // 移除某个依赖的依赖
    delete_rely $uu9/rr9@1.1.1 from #bb0/mm0
    show
  end
/*
 * 无物结同心
 * 烟花不堪剪
 */
alter p4
  do
    hide
    set_title "set_titles"
    set_cover "set_covers"
    add_attr 1 2 3
    delete_attr 4
  end
activate_theme 123