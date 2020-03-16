# book
```
CREATE TABLE public.book
(
    id bigserial NOT NULL,
    "ISBN" "char",
    "BOOK_NAME" "char" NOT NULL,
    "AUTHOR" "char",
    "BOOK_COUNT" integer NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.book
    OWNER to postgres;
```

# admin
```
CREATE TABLE public.admin
(
    id bigserial NOT NULL,
    "ADMIN_ID" "char" NOT NULL,
    "ADMIN_PASSWORD" "char" NOT NULL,

    PRIMARY KEY (id)
);

ALTER TABLE public.book
    OWNER to postgres;
```