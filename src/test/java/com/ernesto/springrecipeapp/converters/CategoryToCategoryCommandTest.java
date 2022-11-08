package com.ernesto.springrecipeapp.converters;

import com.ernesto.springrecipeapp.commands.CategoryCommand;
import com.ernesto.springrecipeapp.domain.Category;
import org.junit.Before;
import org.junit.Test;
import org.yaml.snakeyaml.events.Event;

import static org.junit.Assert.*;

public class CategoryToCategoryCommandTest {

    public static final Long ID_VALUE = new Long(1L);
    public static final String DESCRIPTION = "description";
    CategoryToCategoryCommand converter;

    @Before
    public void setUp() throws Exception {
        converter = new CategoryToCategoryCommand();
    }

    @Test
    public void testNullObject() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new Category()));
    }

    @Test
    public void convert() {
        // given
        Category category = new Category();
        category.setId(ID_VALUE);
        category.setDescription(DESCRIPTION);

        // when
        CategoryCommand command = converter.convert(category);

        // then
        assertEquals(ID_VALUE, command.getId());
        assertEquals(DESCRIPTION, command.getDescription());
    }
}