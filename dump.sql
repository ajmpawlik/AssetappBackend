--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: asset_finance_definitions; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.asset_finance_definitions (
    id bigint NOT NULL,
    definition character varying(255),
    name character varying(255)
);


ALTER TABLE public.asset_finance_definitions OWNER TO postgres;

--
-- Name: asset_finance_definitions_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.asset_finance_definitions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.asset_finance_definitions_id_seq OWNER TO postgres;

--
-- Name: asset_finance_definitions_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.asset_finance_definitions_id_seq OWNED BY public.asset_finance_definitions.id;


--
-- Name: link; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.link (
    id integer NOT NULL,
    url character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    description character varying(255),
    rel character varying(50)
);


ALTER TABLE public.link OWNER TO postgres;

--
-- Name: link_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.link_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.link_id_seq OWNER TO postgres;

--
-- Name: link_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.link_id_seq OWNED BY public.link.id;


--
-- Name: asset_finance_definitions id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.asset_finance_definitions ALTER COLUMN id SET DEFAULT nextval('public.asset_finance_definitions_id_seq'::regclass);


--
-- Name: link id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.link ALTER COLUMN id SET DEFAULT nextval('public.link_id_seq'::regclass);


--
-- Data for Name: asset_finance_definitions; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.asset_finance_definitions (id, definition, name) FROM stdin;
1	def1	name1
2	def2	name2
\.


--
-- Data for Name: link; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.link (id, url, name, description, rel) FROM stdin;
1	https://www.postgresqltutorial.com	PostgreSQL Tutorial	\N	\N
\.


--
-- Name: asset_finance_definitions_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.asset_finance_definitions_id_seq', 2, true);


--
-- Name: link_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.link_id_seq', 1, true);


--
-- Name: asset_finance_definitions asset_finance_definitions_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.asset_finance_definitions
    ADD CONSTRAINT asset_finance_definitions_pkey PRIMARY KEY (id);


--
-- Name: link link_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.link
    ADD CONSTRAINT link_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

