<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Clarity — Creative Agency</title>
  <!-- Bootstrap 5 -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
  <!-- Font Awesome -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" rel="stylesheet" />
  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css2?family=Syne:wght@400;600;700;800&family=DM+Sans:wght@300;400;500&display=swap" rel="stylesheet" />
  <style>
    body { font-family: 'DM Sans', sans-serif; }
    h1, h2, h3, h4, h5, .navbar-brand { font-family: 'Syne', sans-serif; }
     .hero-section { min-height: 100vh; background: rgb(45, 53, 97) 60%;} 
    .bg-dark-alt { background: #111111; }
    .portfolio-item .overlay { opacity: 0; transition: opacity 0.3s; }
    .portfolio-item:hover .overlay { opacity: 1; }
    .service-card { transition: transform 0.3s, box-shadow 0.3s; }
    .service-card:hover { transform: translateY(-6px); box-shadow: 0 16px 48px rgba(13,110,253,.12) !important; }
    .team-social { transform: translateY(100%); transition: transform 0.3s; }
    .team-card:hover .team-social { transform: translateY(0); }
    .nav-scrolled { background: rgba(255,255,255,0.97) !important; box-shadow: 0 2px 20px rgba(0,0,0,.08) !important; }
    .nav-scrolled .nav-link, .nav-scrolled .navbar-brand { color: #0d0d0d !important; }
    .svc-num { font-size: 3rem; font-weight: 800; color: rgba(13,110,253,.1); line-height: 1; }
    .port-bg { aspect-ratio: 4/3; }
    html { scroll-behavior: smooth; }
    .footer-link:hover { color: #ffc107 !important; }
  </style>
</head>
<body>

<!-- ══════════════════════════════
     NAVBAR
══════════════════════════════ -->
<nav id="mainNav" class="navbar navbar-expand-lg fixed-top px-4 px-lg-5 py-3 bg-dark"
     style="background:transparent; transition:all .35s;">
  <div class="container-fluid">
    <a class="navbar-brand fw-bold fs-3 text-white" href="#hero" style="letter-spacing:-.04em;">Clarity.</a>
    <button class="navbar-toggler border-0" type="button" data-bs-toggle="collapse" data-bs-target="#navMenu">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navMenu">
      <ul class="navbar-nav ms-auto align-items-lg-center gap-lg-2">
        <li class="nav-item"><a class="nav-link text-white fw-medium px-3" href="#about">About</a></li>
        <li class="nav-item"><a class="nav-link text-white fw-medium px-3" href="#services">Services</a></li>
        <li class="nav-item"><a class="nav-link text-white fw-medium px-3" href="#portfolio">Work</a></li>
        <li class="nav-item"><a class="nav-link text-white fw-medium px-3" href="#team">Team</a></li>
        <li class="nav-item"><a class="nav-link text-white fw-medium px-3" href="#testimonials">Reviews</a></li>
        <li class="nav-item ms-lg-2">
          <a class="btn btn-outline-secondary text-white fw-bold px-4 text-dark" href="#contact">Get in Touch</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- ══════════════════════════════
     HERO
══════════════════════════════ -->
<section id="hero" class="hero-section d-flex align-items-center position-relative overflow-hidden">
  <div class="position-absolute top-0 start-0 w-100 h-100"
       style="background-image:linear-gradient(rgba(255,255,255,.03) 1px,transparent 1px),linear-gradient(90deg,rgba(255,255,255,.03) 1px,transparent 1px);background-size:60px 60px;pointer-events:none;"></div>

  <div class="container-fluid px-4 px-lg-5 pt-5 pb-4 position-relative" style="z-index:2;">
    <div class="row">
      <div class="col-lg-8 pt-5 mt-3">
        
        <h1 class="display-1 fw-bold text-white lh-1 mb-4" style="letter-spacing:-.04em;">
          We craft brands<br>that <span class="text-dark">inspire</span> &amp;<br><span class="text-dark">convert</span>.
        </h1>
        <p class="lead text-white mb-5" style="max-width:500px;line-height:1.8;">
          Clarity is a full-service creative agency helping ambitious brands build a compelling digital presence — from strategy to launch.
        </p>
        <div class="d-flex gap-3 flex-wrap">
          <a href="#portfolio" class="btn btn-dark  btn-lg fw-bold px-5 text-white">See Our Work</a>
          <a href="#contact" class="btn btn-dark
           btn-lg px-5 fw-semibold">
            <i class="fa-regular fa-circle-play me-2"></i>Start a Project
          </a>
        </div>
      </div>
    </div>

    <!-- Stats row -->
    <div class="row g-4 mt-5 pt-4 border-top border-secondary border-opacity-25">
      <div class="col-6 col-md-3">
        <div class="text-white fw-bold" style="font-family:'Syne',sans-serif;font-size:2.5rem;line-height:1;">
          12<span class="text-dark">+</span>
        </div>
        <p class="text-white-50 small mt-1 mb-0" style="letter-spacing:.05em;">Years in Business</p>
      </div>
      <div class="col-6 col-md-3">
        <div class="text-white fw-bold" style="font-family:'Syne',sans-serif;font-size:2.5rem;line-height:1;">
          340<span class="text-dark">+</span>
        </div>
        <p class="text-white-50 small mt-1 mb-0" style="letter-spacing:.05em;">Projects Delivered</p>
      </div>
      <div class="col-6 col-md-3">
        <div class="text-white fw-bold" style="font-family:'Syne',sans-serif;font-size:2.5rem;line-height:1;">
          98<span class="text-dark">%</span>
        </div>
        <p class="text-white-50 small mt-1 mb-0" style="letter-spacing:.05em;">Client Satisfaction</p>
      </div>
      <div class="col-6 col-md-3">
        <div class="text-white fw-bold" style="font-family:'Syne',sans-serif;font-size:2.5rem;line-height:1;">24</div>
        <p class="text-white-50 small mt-1 mb-0" style="letter-spacing:.05em;">Industry Awards</p>
      </div>
    </div>
  </div>
</section>

<!-- ══════════════════════════════
     ABOUT
══════════════════════════════ -->
<section id="about" class="py-5" style="background:#f7f5f0;">
  <div class="container py-5">
    <div class="row align-items-center g-5">

      <div class="col-lg-5">
        <div class="position-relative rounded-4 overflow-hidden" style="aspect-ratio:4/5;">
          <div class="w-100 h-100 d-flex align-items-center justify-content-center"
               style="background:linear-gradient(135deg,#1c1c2e 0%,#2d3561 60%,#1a2a4a 100%);">
            <svg width="140" height="140" viewBox="0 0 200 200" fill="none" style="opacity:.15;">
              <rect x="20" y="20" width="160" height="120" rx="8" stroke="white" stroke-width="3"/>
              <circle cx="60" cy="80" r="20" stroke="white" stroke-width="3"/>
              <polyline points="20,140 70,90 110,120 150,60 180,80" stroke="white" stroke-width="3" fill="none"/>
            </svg>
          </div>
          <div class="position-absolute bottom-0 start-0 end-0 m-3 p-3 rounded-3"
               style="background:rgba(13,13,13,.85);backdrop-filter:blur(10px);border:1px solid rgba(255,255,255,.08);">
            <div class="text-white fw-bold" style="font-family:'Syne',sans-serif;font-size:1.8rem;">340+</div>
            <p class="text-white-50 small mb-0 mt-1">Successful projects delivered globally</p>
          </div>
        </div>
      </div>

      <div class="col-lg-7">
        <p class="text-primary fw-bold text-uppercase small mb-2" style="letter-spacing:.15em;">Who We Are</p>
        <h2 class="display-5 fw-bold mb-3" style="letter-spacing:-.03em;">
          A team of <span class="text-primary">creative minds</span> driven by results
        </h2>
        <p class="text-secondary mb-4" style="line-height:1.8;font-size:1.05rem;">
          Founded in 2012, Clarity has grown into one of the most trusted creative agencies in the region. We don't just design — we think strategically to solve real business problems with elegant solutions.
        </p>

        <div class="row g-4 mb-4">
          <div class="col-6">
            <div class="d-flex gap-3 align-items-start">
              <div class="bg-primary bg-opacity-10 rounded-3 d-flex align-items-center justify-content-center flex-shrink-0"
                   style="width:44px;height:44px;">
                <i class="fa-solid fa-bullseye text-primary"></i>
              </div>
              <div>
                <h6 class="fw-bold mb-1">Strategy First</h6>
                <p class="text-secondary small mb-0" style="line-height:1.5;">Every project starts with deep research and a clear strategic direction.</p>
              </div>
            </div>
          </div>
          <div class="col-6">
            <div class="d-flex gap-3 align-items-start">
              <div class="bg-primary bg-opacity-10 rounded-3 d-flex align-items-center justify-content-center flex-shrink-0"
                   style="width:44px;height:44px;">
                <i class="fa-solid fa-palette text-primary"></i>
              </div>
              <div>
                <h6 class="fw-bold mb-1">Design Excellence</h6>
                <p class="text-secondary small mb-0" style="line-height:1.5;">Visuals crafted with precision, taste, and purposeful intent.</p>
              </div>
            </div>
          </div>
          <div class="col-6">
            <div class="d-flex gap-3 align-items-start">
              <div class="bg-primary bg-opacity-10 rounded-3 d-flex align-items-center justify-content-center flex-shrink-0"
                   style="width:44px;height:44px;">
                <i class="fa-solid fa-rocket text-primary"></i>
              </div>
              <div>
                <h6 class="fw-bold mb-1">Fast Delivery</h6>
                <p class="text-secondary small mb-0" style="line-height:1.5;">Efficient workflows that respect your timelines without cutting corners.</p>
              </div>
            </div>
          </div>
          <div class="col-6">
            <div class="d-flex gap-3 align-items-start">
              <div class="bg-primary bg-opacity-10 rounded-3 d-flex align-items-center justify-content-center flex-shrink-0"
                   style="width:44px;height:44px;">
                <i class="fa-solid fa-headset text-primary"></i>
              </div>
              <div>
                <h6 class="fw-bold mb-1">Ongoing Support</h6>
                <p class="text-secondary small mb-0" style="line-height:1.5;">Dedicated post-launch care and continuous iteration.</p>
              </div>
            </div>
          </div>
        </div>
        <a href="#contact" class="btn btn-dark btn-lg fw-bold px-5">Work With Us</a>
      </div>
    </div>
  </div>
</section>

<!-- ══════════════════════════════
     SERVICES
══════════════════════════════ -->
<section id="services" class="bg-white py-5">
  <div class="container py-5">
    <div class="row justify-content-between align-items-end mb-5">
      <div class="col-lg-5">
        <p class="text-primary fw-bold text-uppercase small mb-2" style="letter-spacing:.15em;">What We Do</p>
        <h2 class="display-5 fw-bold mb-0" style="letter-spacing:-.03em;">
          Services we <span class="text-primary">excel</span> at
        </h2>
      </div>
      <div class="col-lg-4 mt-3 mt-lg-0">
        <p class="text-secondary mb-0" style="line-height:1.75;">A complete suite of creative services designed to grow your business.</p>
      </div>
    </div>

    <div class="row g-4">
      <div class="col-md-6 col-lg-4">
        <div class="service-card border rounded-4 p-4 p-lg-5 h-100">
          <div class="svc-num mb-2">01</div>
          <div class="bg-dark rounded-3 d-inline-flex align-items-center justify-content-center mb-4"
               style="width:56px;height:56px;">
            <i class="fa-solid fa-pen-nib text-white fs-5"></i>
          </div>
          <h5 class="fw-bold mb-2">Brand Identity</h5>
          <p class="text-secondary small mb-3" style="line-height:1.7;">Logos, typography, color systems, and complete brand guidelines that define who you are and how you appear to the world.</p>
          <a href="#" class="text-primary fw-semibold small text-decoration-none">Learn more <i class="fa-solid fa-arrow-right ms-1"></i></a>
        </div>
      </div>
      <div class="col-md-6 col-lg-4">
        <div class="service-card border rounded-4 p-4 p-lg-5 h-100">
          <div class="svc-num mb-2">02</div>
          <div class="bg-dark rounded-3 d-inline-flex align-items-center justify-content-center mb-4"
               style="width:56px;height:56px;">
            <i class="fa-solid fa-laptop-code text-white fs-5"></i>
          </div>
          <h5 class="fw-bold mb-2">Web Design &amp; Dev</h5>
          <p class="text-secondary small mb-3" style="line-height:1.7;">Beautiful, performance-optimized websites built with modern technologies that drive real engagement and conversions.</p>
          <a href="#" class="text-primary fw-semibold small text-decoration-none">Learn more <i class="fa-solid fa-arrow-right ms-1"></i></a>
        </div>
      </div>
      <div class="col-md-6 col-lg-4">
        <div class="service-card border rounded-4 p-4 p-lg-5 h-100">
          <div class="svc-num mb-2">03</div>
          <div class="bg-dark rounded-3 d-inline-flex align-items-center justify-content-center mb-4"
               style="width:56px;height:56px;">
            <i class="fa-solid fa-chart-line text-white fs-5"></i>
          </div>
          <h5 class="fw-bold mb-2">Digital Marketing</h5>
          <p class="text-secondary small mb-3" style="line-height:1.7;">Data-driven campaigns across SEO, PPC, and social media that put your brand in front of the right audience.</p>
          <a href="#" class="text-primary fw-semibold small text-decoration-none">Learn more <i class="fa-solid fa-arrow-right ms-1"></i></a>
        </div>
      </div>
      <div class="col-md-6 col-lg-4">
        <div class="service-card border rounded-4 p-4 p-lg-5 h-100">
          <div class="svc-num mb-2">04</div>
          <div class="bg-dark rounded-3 d-inline-flex align-items-center justify-content-center mb-4"
               style="width:56px;height:56px;">
            <i class="fa-solid fa-mobile-screen text-white fs-5"></i>
          </div>
          <h5 class="fw-bold mb-2">UI/UX Design</h5>
          <p class="text-secondary small mb-3" style="line-height:1.7;">User-centered interfaces for apps and platforms, crafted through research, wireframing, and iterative testing.</p>
          <a href="#" class="text-primary fw-semibold small text-decoration-none">Learn more <i class="fa-solid fa-arrow-right ms-1"></i></a>
        </div>
      </div>
      <div class="col-md-6 col-lg-4">
        <div class="service-card border rounded-4 p-4 p-lg-5 h-100">
          <div class="svc-num mb-2">05</div>
          <div class="bg-dark rounded-3 d-inline-flex align-items-center justify-content-center mb-4"
               style="width:56px;height:56px;">
            <i class="fa-solid fa-photo-film text-white fs-5"></i>
          </div>
          <h5 class="fw-bold mb-2">Content Creation</h5>
          <p class="text-secondary small mb-3" style="line-height:1.7;">Photography, video production, and copywriting that tells your brand story with impact and authenticity.</p>
          <a href="#" class="text-primary fw-semibold small text-decoration-none">Learn more <i class="fa-solid fa-arrow-right ms-1"></i></a>
        </div>
      </div>
      <div class="col-md-6 col-lg-4">
        <div class="service-card border rounded-4 p-4 p-lg-5 h-100">
          <div class="svc-num mb-2">06</div>
          <div class="bg-dark rounded-3 d-inline-flex align-items-center justify-content-center mb-4"
               style="width:56px;height:56px;">
            <i class="fa-solid fa-bullhorn text-white fs-5"></i>
          </div>
          <h5 class="fw-bold mb-2">Social Media</h5>
          <p class="text-secondary small mb-3" style="line-height:1.7;">Strategic social presence management that builds community, drives engagement, and elevates brand awareness.</p>
          <a href="#" class="text-primary fw-semibold small text-decoration-none">Learn more <i class="fa-solid fa-arrow-right ms-1"></i></a>
        </div>
      </div>
    </div>
  </div>
</section>

<!-- ══════════════════════════════
     PORTFOLIO
══════════════════════════════ -->
<section id="portfolio" class="bg-dark-alt py-5">
  <div class="container py-5">
    <div class="row justify-content-between align-items-end mb-5">
      <div class="col-lg-6">
        <p class="text-warning fw-bold text-uppercase small mb-2" style="letter-spacing:.15em;">Our Portfolio</p>
        <h2 class="display-5 fw-bold text-white mb-0" style="letter-spacing:-.03em;">
          Work we're <span class="text-warning">proud of</span>
        </h2>
      </div>
      <div class="col-lg-auto mt-3 mt-lg-0">
        <div class="d-flex gap-2 flex-wrap" id="portFilters">
          <button class="btn btn-warning btn-sm fw-semibold rounded-pill px-3" data-cat="all">All</button>
          <button class="btn btn-outline-secondary btn-sm fw-semibold rounded-pill px-3" data-cat="brand">Branding</button>
          <button class="btn btn-outline-secondary btn-sm fw-semibold rounded-pill px-3" data-cat="web">Web</button>
          <button class="btn btn-outline-secondary btn-sm fw-semibold rounded-pill px-3" data-cat="design">Design</button>
        </div>
      </div>
    </div>

    <div class="row g-3">
      <div class="col-lg-7">
        <div class="portfolio-item position-relative rounded-4 overflow-hidden">
          <div class="d-flex align-items-center justify-content-center"
               style="background:linear-gradient(135deg,#1a1a2e,#3a5ccc);aspect-ratio:16/9;">
            <svg width="80" height="80" viewBox="0 0 80 80" fill="none" style="opacity:.15;">
              <circle cx="40" cy="40" r="35" stroke="white" stroke-width="2"/>
            </svg>
          </div>
          <div class="overlay position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center justify-content-center"
               style="background:rgba(13,13,13,.78);">
            <div class="text-center text-white p-3">
              <h5 class="fw-bold mb-1">Motionix Rebrand</h5>
              <span class="text-warning small">Brand Identity</span><br>
              <a href="#" class="btn btn-light btn-sm rounded-circle mt-3 d-inline-flex align-items-center justify-content-center"
                 style="width:40px;height:40px;">
                <i class="fa-solid fa-arrow-up-right-from-square" style="font-size:.7rem;"></i>
              </a>
            </div>
          </div>
        </div>
      </div>
      <div class="col-lg-5">
        <div class="portfolio-item position-relative rounded-4 overflow-hidden">
          <div class="d-flex align-items-center justify-content-center"
               style="background:linear-gradient(135deg,#1c0f0f,#8b2635);aspect-ratio:1/1;">
            <svg width="60" height="60" fill="none" style="opacity:.15;">
              <rect x="5" y="5" width="50" height="50" rx="6" stroke="white" stroke-width="2"/>
            </svg>
          </div>
          <div class="overlay position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center justify-content-center"
               style="background:rgba(13,13,13,.78);">
            <div class="text-center text-white p-3">
              <h5 class="fw-bold mb-1">Ember E-Commerce</h5>
              <span class="text-warning small">Web Design</span>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="portfolio-item position-relative rounded-4 overflow-hidden">
          <div class="port-bg d-flex align-items-center justify-content-center"
               style="background:linear-gradient(135deg,#0f1e1a,#1e6851);">
            <svg width="55" height="55" fill="none" style="opacity:.15;">
              <polygon points="27,4 52,48 2,48" stroke="white" stroke-width="2" fill="none"/>
            </svg>
          </div>
          <div class="overlay position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center justify-content-center"
               style="background:rgba(13,13,13,.78);">
            <div class="text-center text-white p-3">
              <h5 class="fw-bold mb-1">Verdant Packaging</h5>
              <span class="text-warning small">Visual Design</span>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="portfolio-item position-relative rounded-4 overflow-hidden">
          <div class="port-bg d-flex align-items-center justify-content-center"
               style="background:linear-gradient(135deg,#1a1200,#8a6200);">
            <svg width="55" height="55" fill="none" style="opacity:.15;">
              <circle cx="27" cy="27" r="22" stroke="white" stroke-width="2" stroke-dasharray="6 4"/>
            </svg>
          </div>
          <div class="overlay position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center justify-content-center"
               style="background:rgba(13,13,13,.78);">
            <div class="text-center text-white p-3">
              <h5 class="fw-bold mb-1">Auric Finance App</h5>
              <span class="text-warning small">UI/UX Design</span>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="portfolio-item position-relative rounded-4 overflow-hidden">
          <div class="port-bg d-flex align-items-center justify-content-center"
               style="background:linear-gradient(135deg,#12121e,#4a1080);">
            <svg width="55" height="55" fill="none" style="opacity:.15;">
              <rect x="5" y="5" width="18" height="18" stroke="white" stroke-width="2"/>
              <rect x="27" y="5" width="18" height="18" stroke="white" stroke-width="2"/>
              <rect x="5" y="27" width="18" height="18" stroke="white" stroke-width="2"/>
              <rect x="27" y="27" width="18" height="18" stroke="white" stroke-width="2"/>
            </svg>
          </div>
          <div class="overlay position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center justify-content-center"
               style="background:rgba(13,13,13,.78);">
            <div class="text-center text-white p-3">
              <h5 class="fw-bold mb-1">Luminos SaaS</h5>
              <span class="text-warning small">Web Design</span>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="text-center mt-5">
      <a href="#" class="btn btn-outline-light btn-lg fw-semibold px-5">
        View All Projects <i class="fa-solid fa-arrow-right ms-2"></i>
      </a>
    </div>
  </div>
</section>

<!-- ══════════════════════════════
     TEAM
══════════════════════════════ -->
<section id="team" class="py-5" style="background:#f7f5f0;">
  <div class="container py-5">
    <div class="row justify-content-center text-center mb-5">
      <div class="col-lg-6">
        <p class="text-primary fw-bold text-uppercase small mb-2" style="letter-spacing:.15em;">Our Team</p>
        <h2 class="display-5 fw-bold mb-0" style="letter-spacing:-.03em;">
          Meet the <span class="text-primary">talented</span> people behind the work
        </h2>
      </div>
    </div>

    <div class="row g-4">
      <div class="col-6 col-lg-3">
        <div class="team-card text-center">
          <div class="position-relative rounded-4 overflow-hidden mb-3">
            <div class="d-flex align-items-center justify-content-center"
                 style="background:linear-gradient(135deg,#e8d5b0,#d4a843);aspect-ratio:1;font-size:4rem;">👩‍💼</div>
            <div class="team-social position-absolute bottom-0 start-0 end-0 d-flex justify-content-center gap-3 p-3"
                 style="background:rgba(13,13,13,.85);">
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-linkedin-in"></i></a>
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-twitter"></i></a>
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-behance"></i></a>
            </div>
          </div>
          <h6 class="fw-bold mb-1">Sophia Williams</h6>
          <small class="text-secondary">Founder &amp; Creative Director</small>
        </div>
      </div>
      <div class="col-6 col-lg-3">
        <div class="team-card text-center">
          <div class="position-relative rounded-4 overflow-hidden mb-3">
            <div class="d-flex align-items-center justify-content-center"
                 style="background:linear-gradient(135deg,#b0c4e8,#3a5ccc);aspect-ratio:1;font-size:4rem;">👨‍💻</div>
            <div class="team-social position-absolute bottom-0 start-0 end-0 d-flex justify-content-center gap-3 p-3"
                 style="background:rgba(13,13,13,.85);">
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-linkedin-in"></i></a>
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-github"></i></a>
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-twitter"></i></a>
            </div>
          </div>
          <h6 class="fw-bold mb-1">Marcus Chen</h6>
          <small class="text-secondary">Lead Developer</small>
        </div>
      </div>
      <div class="col-6 col-lg-3">
        <div class="team-card text-center">
          <div class="position-relative rounded-4 overflow-hidden mb-3">
            <div class="d-flex align-items-center justify-content-center"
                 style="background:linear-gradient(135deg,#b0e8c8,#1e6851);aspect-ratio:1;font-size:4rem;">👩‍🎨</div>
            <div class="team-social position-absolute bottom-0 start-0 end-0 d-flex justify-content-center gap-3 p-3"
                 style="background:rgba(13,13,13,.85);">
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-linkedin-in"></i></a>
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-instagram"></i></a>
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-behance"></i></a>
            </div>
          </div>
          <h6 class="fw-bold mb-1">Priya Nair</h6>
          <small class="text-secondary">Senior UI/UX Designer</small>
        </div>
      </div>
      <div class="col-6 col-lg-3">
        <div class="team-card text-center">
          <div class="position-relative rounded-4 overflow-hidden mb-3">
            <div class="d-flex align-items-center justify-content-center"
                 style="background:linear-gradient(135deg,#e8b0b0,#8b2635);aspect-ratio:1;font-size:4rem;">👨‍📊</div>
            <div class="team-social position-absolute bottom-0 start-0 end-0 d-flex justify-content-center gap-3 p-3"
                 style="background:rgba(13,13,13,.85);">
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-linkedin-in"></i></a>
              <a href="#" class="text-white text-decoration-none"><i class="fab fa-twitter"></i></a>
            </div>
          </div>
          <h6 class="fw-bold mb-1">James Porter</h6>
          <small class="text-secondary">Head of Marketing</small>
        </div>
      </div>
    </div>
  </div>
</section>

<!-- ══════════════════════════════
     TESTIMONIALS
══════════════════════════════ -->
<section id="testimonials" class="bg-white py-5">
  <div class="container py-5">
    <div class="row justify-content-center text-center mb-5">
      <div class="col-lg-6">
        <p class="text-primary fw-bold text-uppercase small mb-2" style="letter-spacing:.15em;">Testimonials</p>
        <h2 class="display-5 fw-bold mb-0" style="letter-spacing:-.03em;">
          What our <span class="text-primary">clients</span> say
        </h2>
      </div>
    </div>
    <div class="row g-4">
      <div class="col-md-6 col-lg-4">
        <div class="border rounded-4 p-4 h-100">
          <div class="text-warning mb-3 fs-6">★★★★★</div>
          <p class="text-secondary fst-italic mb-4" style="line-height:1.75;">"Clarity completely transformed how our brand looks and feels. Their attention to detail is unmatched. Our conversions increased by 40% after the redesign."</p>
          <div class="d-flex align-items-center gap-3">
            <div class="bg-primary rounded-circle d-flex align-items-center justify-content-center text-white fw-bold flex-shrink-0"
                 style="width:46px;height:46px;">AL</div>
            <div>
              <div class="fw-semibold">Amelia Lawson</div>
              <small class="text-secondary">CEO, Horizons Tech</small>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-6 col-lg-4">
        <div class="border rounded-4 p-4 h-100">
          <div class="text-warning mb-3 fs-6">★★★★★</div>
          <p class="text-secondary fst-italic mb-4" style="line-height:1.75;">"From strategy to execution, the Clarity team was an absolute pleasure to work with. They delivered ahead of schedule and the quality blew us away."</p>
          <div class="d-flex align-items-center gap-3">
            <div class="bg-warning rounded-circle d-flex align-items-center justify-content-center text-dark fw-bold flex-shrink-0"
                 style="width:46px;height:46px;">RK</div>
            <div>
              <div class="fw-semibold">Raj Kapoor</div>
              <small class="text-secondary">Founder, Nomad Studio</small>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-6 col-lg-4">
        <div class="border rounded-4 p-4 h-100">
          <div class="text-warning mb-3 fs-6">★★★★★</div>
          <p class="text-secondary fst-italic mb-4" style="line-height:1.75;">"The new website they built for us is stunning and fast. Our bounce rate dropped significantly and we've seen a real uptick in qualified leads."</p>
          <div class="d-flex align-items-center gap-3">
            <div class="rounded-circle d-flex align-items-center justify-content-center text-white fw-bold flex-shrink-0"
                 style="width:46px;height:46px;background:#1e6851;">SB</div>
            <div>
              <div class="fw-semibold">Sarah Bennett</div>
              <small class="text-secondary">Marketing Director, Verdant Co.</small>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<!-- ══════════════════════════════
     CTA STRIP
══════════════════════════════ -->
<section class="bg-dark py-5">
  <div class="container py-4 text-center">
    <h2 class="display-6 fw-bold text-white mb-3" style="letter-spacing:-.03em;">Ready to elevate your brand?</h2>
    <p class="text-white-50 mb-4 fs-5">Let's build something remarkable together. Tell us about your project.</p>
    <a href="#contact" class="btn btn-light btn-lg fw-bold px-5 text-primary">Start a Conversation</a>
  </div>
</section>

<!-- ══════════════════════════════
     CONTACT
══════════════════════════════ -->
<section id="contact" class="py-5" style="background:#f7f5f0;">
  <div class="container py-5">
    <div class="row g-5">
      <div class="col-lg-5">
        <p class="text-primary fw-bold text-uppercase small mb-2" style="letter-spacing:.15em;">Get In Touch</p>
        <h2 class="display-5 fw-bold mb-3" style="letter-spacing:-.03em;">
          Let's talk about your <span class="text-primary">project</span>
        </h2>
        <p class="text-secondary mb-4" style="line-height:1.8;">Have a project in mind? We'd love to hear from you.</p>

        <div class="d-flex gap-3 align-items-start mb-4">
          <div class="bg-dark rounded-3 d-flex align-items-center justify-content-center flex-shrink-0"
               style="width:50px;height:50px;">
            <i class="fa-solid fa-location-dot text-white"></i>
          </div>
          <div>
            <h6 class="fw-bold mb-1">Visit Us</h6>
            <p class="text-secondary small mb-0">14 Creative Park, Sector 12<br>Mumbai, India 400001</p>
          </div>
        </div>
        <div class="d-flex gap-3 align-items-start mb-4">
          <div class="bg-dark rounded-3 d-flex align-items-center justify-content-center flex-shrink-0"
               style="width:50px;height:50px;">
            <i class="fa-solid fa-envelope text-white"></i>
          </div>
          <div>
            <h6 class="fw-bold mb-1">Email Us</h6>
            <p class="text-secondary small mb-0">hello@clarityagency.co<br>new.projects@clarityagency.co</p>
          </div>
        </div>
        <div class="d-flex gap-3 align-items-start">
          <div class="bg-dark rounded-3 d-flex align-items-center justify-content-center flex-shrink-0"
               style="width:50px;height:50px;">
            <i class="fa-solid fa-phone text-white"></i>
          </div>
          <div>
            <h6 class="fw-bold mb-1">Call Us</h6>
            <p class="text-secondary small mb-0">+91 98765 43210<br>Mon–Fri, 9am–6pm IST</p>
          </div>
        </div>
      </div>

      <div class="col-lg-7">
        <div class="bg-white rounded-4 p-4 p-lg-5 shadow-sm">
          <h4 class="fw-bold mb-4">Send us a message</h4>
          <div class="row g-3">
            <div class="col-md-6">
              <label class="form-label small fw-semibold">First Name</label>
              <input type="text" class="form-control form-control-lg rounded-3" placeholder="jay" />
            </div>
            <div class="col-md-6">
              <label class="form-label small fw-semibold">Last Name</label>
              <input type="text" class="form-control form-control-lg rounded-3" placeholder="sharma" />
            </div>
            <div class="col-12">
              <label class="form-label small fw-semibold">Email Address</label>
              <input type="email" class="form-control form-control-lg rounded-3" placeholder="jay@example.com" />
            </div>
            <div class="col-12">
              <label class="form-label small fw-semibold">Service Interested In</label>
              <select class="form-select form-select-lg rounded-3">
                <option value="">Select a service…</option>
                <option>Brand Identity</option>
                <option>Web Design &amp; Dev</option>
                <option>Digital Marketing</option>
                <option>UI/UX Design</option>
                <option>Content Creation</option>
                <option>Social Media</option>
              </select>
            </div>
            <div class="col-12">
              <label class="form-label small fw-semibold">Message</label>
              <textarea class="form-control rounded-3" rows="4" placeholder="Tell us about your project…"></textarea>
            </div>
            <div class="col-12">
              <button class="btn btn-dark btn-lg w-100 fw-bold rounded-3">
                Send Message <i class="fa-solid fa-paper-plane ms-2"></i>
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<!-- ══════════════════════════════
     FOOTER
══════════════════════════════ -->
<footer class="bg-dark text-white py-5">
  <div class="container py-4">
    <div class="row g-5 mb-5">
      <div class="col-lg-4">
        <div class="fw-bold mb-3" style="font-family:'Syne',sans-serif;font-size:1.9rem;letter-spacing:-.04em;">Clarity.</div>
        <p class="text-white-50 small mb-4" style="line-height:1.75;max-width:270px;">
          A full-service creative agency helping ambitious brands build compelling digital presences that inspire and convert.
        </p>
        <div class="d-flex gap-2 flex-wrap">
          <a href="#" class="btn btn-outline-secondary btn-sm rounded-3 text-white d-flex align-items-center justify-content-center" style="width:38px;height:38px;padding:0;"><i class="fab fa-twitter"></i></a>
          <a href="#" class="btn btn-outline-secondary btn-sm rounded-3 text-white d-flex align-items-center justify-content-center" style="width:38px;height:38px;padding:0;"><i class="fab fa-instagram"></i></a>
          <a href="#" class="btn btn-outline-secondary btn-sm rounded-3 text-white d-flex align-items-center justify-content-center" style="width:38px;height:38px;padding:0;"><i class="fab fa-linkedin-in"></i></a>
          <a href="#" class="btn btn-outline-secondary btn-sm rounded-3 text-white d-flex align-items-center justify-content-center" style="width:38px;height:38px;padding:0;"><i class="fab fa-behance"></i></a>
          <a href="#" class="btn btn-outline-secondary btn-sm rounded-3 text-white d-flex align-items-center justify-content-center" style="width:38px;height:38px;padding:0;"><i class="fab fa-dribbble"></i></a>
        </div>
      </div>
      <div class="col-6 col-lg-2">
        <h6 class="text-white-50 text-uppercase small fw-bold mb-3" style="letter-spacing:.1em;">Company</h6>
        <ul class="list-unstyled">
          <li class="mb-2"><a href="#about" class="footer-link text-white-50 text-decoration-none small">About Us</a></li>
          <li class="mb-2"><a href="#team" class="footer-link text-white-50 text-decoration-none small">Our Team</a></li>
          <li class="mb-2"><a href="#portfolio" class="footer-link text-white-50 text-decoration-none small">Portfolio</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Careers</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Press</a></li>
        </ul>
      </div>
      <div class="col-6 col-lg-2">
        <h6 class="text-white-50 text-uppercase small fw-bold mb-3" style="letter-spacing:.1em;">Services</h6>
        <ul class="list-unstyled">
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Brand Identity</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Web Design</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Marketing</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">UI/UX Design</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Content</a></li>
        </ul>
      </div>
      <div class="col-6 col-lg-2">
        <h6 class="text-white-50 text-uppercase small fw-bold mb-3" style="letter-spacing:.1em;">Connect</h6>
        <ul class="list-unstyled">
          <li class="mb-2"><a href="#contact" class="footer-link text-white-50 text-decoration-none small">Contact Us</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Blog</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Case Studies</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Privacy Policy</a></li>
          <li class="mb-2"><a href="#" class="footer-link text-white-50 text-decoration-none small">Terms</a></li>
        </ul>
      </div>
    </div>
    <div class="border-top border-secondary border-opacity-25 pt-4 d-flex flex-column flex-md-row justify-content-between gap-2">
      <p class="text-white-50 small mb-0">© 2025 Clarity Creative Agency. All rights reserved.</p>
      <p class="text-white-50 small mb-0">Designed with ♥ for ambitious brands.</p>
    </div>
  </div>
</footer>

<!-- Bootstrap JS bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
