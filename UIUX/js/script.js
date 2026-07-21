// Shared behavior for the portfolio website.
const menuToggle = document.querySelector('.menu-toggle');
const siteNav = document.querySelector('.site-nav');
const themeToggle = document.getElementById('themeToggle');
const scrollTopButton = document.getElementById('scrollTop');
const years = document.querySelectorAll('#year');
const typingText = document.getElementById('typingText');
const contactForm = document.getElementById('contactForm');
const formStatus = document.getElementById('formStatus');

// Mobile navigation toggle.
if (menuToggle && siteNav) {
  menuToggle.addEventListener('click', () => {
    const isOpen = siteNav.classList.toggle('open');
    menuToggle.setAttribute('aria-expanded', String(isOpen));
  });
}

// Active navigation highlight based on current page.
const currentPage = document.body.dataset.page;
const navLinks = document.querySelectorAll('.site-nav a');
navLinks.forEach((link) => {
  const href = link.getAttribute('href');
  if (href && href.includes(currentPage) && currentPage !== 'home') {
    link.classList.add('active');
  }
});

// Theme toggle.
const savedTheme = localStorage.getItem('portfolio-theme');
if (savedTheme === 'dark') {
  document.body.classList.add('dark');
  if (themeToggle) themeToggle.textContent = '☀️';
}

if (themeToggle) {
  themeToggle.addEventListener('click', () => {
    document.body.classList.toggle('dark');
    const isDark = document.body.classList.contains('dark');
    localStorage.setItem('portfolio-theme', isDark ? 'dark' : 'light');
    themeToggle.textContent = isDark ? '☀️' : '🌙';
  });
}

// Current year in footer.
years.forEach((yearEl) => {
  yearEl.textContent = new Date().getFullYear();
});

// Scroll-to-top button visibility.
window.addEventListener('scroll', () => {
  if (window.scrollY > 400) {
    scrollTopButton.style.display = 'block';
  } else {
    scrollTopButton.style.display = 'none';
  }
});

if (scrollTopButton) {
  scrollTopButton.addEventListener('click', () => {
    window.scrollTo({ top: 0, behavior: 'smooth' });
  });
}

// Smooth scrolling for internal anchor links.
document.querySelectorAll('a[href^="#"]').forEach((anchor) => {
  anchor.addEventListener('click', (event) => {
    const targetId = anchor.getAttribute('href');
    if (!targetId || targetId === '#') return;
    const target = document.querySelector(targetId);
    if (target) {
      event.preventDefault();
      target.scrollIntoView({ behavior: 'smooth' });
    }
  });
});

// Typing animation on homepage.
if (typingText) {
  const words = ['Java Full Stack Developer', 'Web Developer', 'Problem Solver'];
  let wordIndex = 0;
  let charIndex = 0;
  let isDeleting = false;

  function type() {
    const currentWord = words[wordIndex];
    typingText.textContent = currentWord.substring(0, charIndex);

    if (!isDeleting && charIndex < currentWord.length) {
      charIndex++;
      setTimeout(type, 120);
    } else if (isDeleting && charIndex > 0) {
      charIndex--;
      setTimeout(type, 80);
    } else {
      isDeleting = !isDeleting;
      wordIndex = (wordIndex + 1) % words.length;
      setTimeout(type, 900);
    }
  }

  type();
}

// Animate progress bars when skills section appears.
const progressBars = document.querySelectorAll('.progress-bar span');
const animateProgress = () => {
  progressBars.forEach((bar) => {
    const width = bar.style.getPropertyValue('--skill') || bar.getAttribute('data-width');
    if (width) {
      bar.style.width = width;
    }
  });
};

if (progressBars.length) {
  const observer = new IntersectionObserver((entries) => {
    entries.forEach((entry) => {
      if (entry.isIntersecting) {
        animateProgress();
        observer.disconnect();
      }
    });
  }, { threshold: 0.3 });

  const skillsSection = document.querySelector('.skills-grid');
  if (skillsSection) observer.observe(skillsSection);
}

// Form validation.
if (contactForm) {
  contactForm.addEventListener('submit', (event) => {
    event.preventDefault();
    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();
    const subject = document.getElementById('subject').value.trim();
    const message = document.getElementById('message').value.trim();

    if (!name || !email || !subject || !message) {
      formStatus.textContent = 'Please fill in all fields before submitting.';
      return;
    }

    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
      formStatus.textContent = 'Please enter a valid email address.';
      return;
    }

    formStatus.textContent = 'Thank you! Your message has been submitted successfully.';
    contactForm.reset();
  });
}
